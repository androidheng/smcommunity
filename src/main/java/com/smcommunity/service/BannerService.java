package com.smcommunity.service;
import java.util.List;
import com.smcommunity.pojo.TbBanner;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface BannerService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbBanner> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbBanner banner);
	
	
	/**
	 * 修改
	 */
	public void update(TbBanner banner);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbBanner findOne(Integer id);
	
	
	/**
	 * 删除
	 * @param id
	 */
	public void delete(Integer  id);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbBanner banner, int pageNum,int pageSize);
	
}
