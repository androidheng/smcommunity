package com.smcommunity.service;
import java.util.List;
import com.smcommunity.pojo.TbTwoinfo;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface TwoinfoService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbTwoinfo> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbTwoinfo twoinfo);
	
	
	/**
	 * 修改
	 */
	public void update(TbTwoinfo twoinfo);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbTwoinfo findOne(Integer id);
	
	
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
	public PageResult findPage(TbTwoinfo twoinfo, int pageNum,int pageSize);
	
}
