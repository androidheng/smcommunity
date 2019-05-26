package com.smcommunity.service;
import java.util.List;
import com.smcommunity.pojo.TbWords;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface WordsService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbWords> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbWords users);
	
	
	/**
	 * 修改
	 */
	public void update(TbWords users);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbWords findOne(Integer id);
	
	
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
	public PageResult findPage(TbWords users, int pageNum,int pageSize);


	public List<TbWords> findAll(String name);
	
}
