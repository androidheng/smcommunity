package com.smcommunity.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smcommunity.pojo.TbSentiment;
import com.smcommunity.service.SentimentService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/sentiment")
public class SentimentController {

	@Autowired
	private SentimentService sentimentService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbSentiment> findAll(){			
		return sentimentService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return sentimentService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param banner
	 * @return
	 */
	@RequestMapping(value="/addOrUpdate",produces = "application/json;charset=UTF-8")
	public String add( TbSentiment banner,HttpServletRequest request){
		try {
			if(StringUtils.isEmpty(banner.getId())) {
				sentimentService.add(banner);
				return  "增加成功";
			}else {
				sentimentService.update(banner);
				return  "修改成功";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return  "增加失败";
		}
	}
	
	/**
	 * 修改
	 * @param banner
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbSentiment banner){
		try {
			sentimentService.update(banner);
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
	public TbSentiment findOne(Integer id){
		return sentimentService.findOne(id);		
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer  id){
		try {
			sentimentService.delete(id);
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
	@RequestMapping("/search")
	public PageResult search( int page, int rows  ){
		return sentimentService.findPage(null, page, rows);		
	}
	
}
