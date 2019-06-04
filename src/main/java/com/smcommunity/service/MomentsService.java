package com.smcommunity.service;
import java.util.List;
import com.smcommunity.pojo.TbMoments;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface MomentsService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbMoments> findAll(String key);
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbMoments moments);
	
	
	/**
	 * 修改
	 */
	public void update(TbMoments moments);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbMoments findOne(Integer id);
	
	
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
	public PageResult findPage(TbMoments moments, int pageNum,int pageSize);


	public List<TbMoments> findMyComents(int uid);


	public List<TbMoments> findMyAll(String uid);


	public PageResult findPage(String key, String startdate, String enddate, int page, int rows);


	public PageResult findPage(String key, String date, int page, int rows);
	
}
