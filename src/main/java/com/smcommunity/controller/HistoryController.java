package com.smcommunity.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.smcommunity.pojo.TbGoods;
import com.smcommunity.pojo.TbHistory;
import com.smcommunity.pojo.TbType;
import com.smcommunity.service.GoodsService;
import com.smcommunity.service.HistoryService;
import com.smcommunity.service.TypeService;
import com.smcommunity.utils.DateUtils;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/history")
public class HistoryController {

	@Autowired
	private HistoryService historyService;
	
	@Autowired
	private GoodsService goodsService;
	@Autowired
	private TypeService tpService;
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbGoods> findAll(String uid){		
		return historyService.findAll(Integer.parseInt(uid));
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return historyService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param history
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(TbHistory history){
		try {
			TbHistory hasHistory=historyService.findHistory(history);
			if(hasHistory!=null) {
				hasHistory.setCreatetime(DateUtils.getCurrent());
				historyService.update(hasHistory);
				return new Result(true, "修改成功");
			}else {
				TbGoods tbGoods = goodsService.findOne(history.getGid());
				//if(!StringUtils.isEmpty(tbGoods.getWid())) {
					TbType tbType = tpService.findOne(tbGoods.getTid());
					history.setTname(tbType.getEtypename());
				//}
				   
				history.setCreatetime(DateUtils.getCurrent());
				historyService.add(history);
				return new Result(true, "增加成功");
			}
		
			
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param history
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbHistory history){
		try {
			historyService.update(history);
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
	public TbHistory findOne(Integer id){
		return historyService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			historyService.delete(ids);
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
	public PageResult search(@RequestBody TbHistory history, int page, int rows  ){
		return historyService.findPage(history, page, rows);		
	}
	
}
