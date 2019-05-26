package com.smcommunity.service;
import java.util.List;
import com.smcommunity.pojo.TbForum;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface ForumService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbForum> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbForum forum);
	
	
	/**
	 * 修改
	 */
	public void update(TbForum forum);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbForum findOne(Integer id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer [] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbForum forum, int pageNum,int pageSize);
	
}
