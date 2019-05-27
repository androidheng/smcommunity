package com.smcommunity.service;
import java.util.List;
import com.smcommunity.pojo.TbMessage;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface MessageService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbMessage> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbMessage message);
	
	
	/**
	 * 修改
	 */
	public void update(TbMessage message);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbMessage findOne(Integer id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer id);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbMessage message, int pageNum,int pageSize);


	public List<TbMessage> findShou();
	
}
