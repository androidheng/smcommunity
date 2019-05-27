package com.smcommunity.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.smcommunity.pojo.TbMessage;
import com.smcommunity.service.MessageService;
import com.smcommunity.utils.DateUtils;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/message")
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbMessage> findAll(){			
		return messageService.findAll();
	}
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findShou")
	public List<TbMessage> findShou(){			
		return messageService.findShou();
	}
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return messageService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param message
	 * @return
	 */
	@RequestMapping(value="/addOrUpdate",produces = "application/json;charset=UTF-8")
	public String add(TbMessage message){
		if(message.getId()!=null) {
			try {
				messageService.update(message);
				return  "修改成功";
			} catch (Exception e) {
				e.printStackTrace();
				return "修改失败";
			}
		}else {
			try {
				message.setCreatetime(DateUtils.getCurrent());
				messageService.add(message);
				return "增加成功";
			} catch (Exception e) {
				e.printStackTrace();
				return  "增加失败";
			}
		}
	
	}
	
	/**
	 * 修改
	 * @param message
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbMessage message){
		try {
			messageService.update(message);
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
	public TbMessage findOne(Integer id){
		return messageService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer  id){
		try {
			messageService.delete(id);
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
	public PageResult search(String key , int page, int rows  ){
		TbMessage message=null;
		if(!StringUtils.isEmpty(key)) {
			message=new TbMessage();
			message.setTitle(key);
		}
		return messageService.findPage(message, page, rows);		
	}
	
}
