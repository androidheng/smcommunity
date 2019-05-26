package com.smcommunity.service;
import java.util.List;
import com.smcommunity.pojo.TbReview;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface ReviewService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbReview> findAll(int cid);
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbReview review);
	
	
	/**
	 * 修改
	 */
	public void update(TbReview review);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbReview findOne(Integer id);
	
	
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
	public PageResult findPage(TbReview review, int pageNum,int pageSize);
	
}
