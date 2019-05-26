package com.smcommunity.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smcommunity.pojo.TbRepair;
import com.smcommunity.service.RepairService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/repair")
public class RepairController {

	@Autowired
	private RepairService repairService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbRepair> findAll(){			
		return repairService.findAll();
	}
	@RequestMapping("/toRepairList")
	public String toRepairList(){			
		return "repairlist";
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return repairService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param repair
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/add")
	public Result add( TbRepair repair){
		try {
			System.out.println(repair.getContact());
			repairService.add(repair);
			return new Result(200, "报修成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(201, "增加失败");
		}
	}
	@ResponseBody
	@RequestMapping(value="/addOrUpdate",produces = "application/json;charset=UTF-8")
	public String addOrUpdate(TbRepair repair,HttpServletRequest request){
		if(StringUtils.isEmpty(repair.getId())){//没有id,执行添加操作
			try {
				repairService.add(repair);
				return "添加成功!";
			} catch (Exception e) {
				e.printStackTrace();
				return "添加失败!";
			}
		}else{//存在id 执行更新操作
			try {
				repairService.update(repair);
				return "修改成功!";
			} catch (Exception e) {
				e.printStackTrace();
				return "修改失败!";
			}
		}
	
	}
	/**
	 * 修改
	 * @param repair
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbRepair repair){
		try {
			repairService.update(repair);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbRepair findOne(Integer id){
		return repairService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			repairService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/search")
	public PageResult search(String key , int page, int rows  ){
		TbRepair repair=null;
		if(!StringUtils.isEmpty(key)){
			repair=new TbRepair();
			repair.setName(key);
		}
		return repairService.findPage(repair, page, rows);				
	}
}
