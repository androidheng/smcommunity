package com.smcommunity.service;
import java.util.List;
import com.smcommunity.pojo.TbRecomuid;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface RecomuidService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbRecomuid> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbRecomuid banner);
	
	
	/**
	 * 修改
	 */
	public void update(TbRecomuid banner);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbRecomuid findOne(Integer id);
	
	
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
	public PageResult findPage(TbRecomuid banner, int pageNum,int pageSize);
	
}
