package com.smcommunity.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smcommunity.mapper.TbRecomuidMapper;
import com.smcommunity.pojo.TbRecomuid;
import com.smcommunity.pojo.TbRecomuidExample;
import com.smcommunity.pojo.TbRecomuidExample.Criteria;
import com.smcommunity.service.BannerService;
import com.smcommunity.service.RecomuidService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class RecomuidServiceImpl implements RecomuidService {

	@Autowired
	private TbRecomuidMapper bannerMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbRecomuid> findAll() {
		return bannerMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbRecomuid> page=   (Page<TbRecomuid>) bannerMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbRecomuid banner) {
		bannerMapper.insert(banner);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbRecomuid banner){
		bannerMapper.updateByPrimaryKeySelective(banner);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbRecomuid findOne(Integer id){
		return bannerMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer id) {
		bannerMapper.deleteByPrimaryKey(id);
	}
	
	
		@Override
	public PageResult findPage(TbRecomuid banner, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbRecomuidExample example=new TbRecomuidExample();
		Criteria criteria = example.createCriteria();
		
		if(banner!=null){			
				
		}
		
		Page<TbRecomuid> page= (Page<TbRecomuid>)bannerMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
