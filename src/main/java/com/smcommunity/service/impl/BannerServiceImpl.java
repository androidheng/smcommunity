package com.smcommunity.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smcommunity.mapper.TbBannerMapper;
import com.smcommunity.pojo.TbBanner;
import com.smcommunity.pojo.TbBannerExample;
import com.smcommunity.pojo.TbBannerExample.Criteria;
import com.smcommunity.service.BannerService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class BannerServiceImpl implements BannerService {

	@Autowired
	private TbBannerMapper bannerMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbBanner> findAll() {
		return bannerMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbBanner> page=   (Page<TbBanner>) bannerMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbBanner banner) {
		bannerMapper.insert(banner);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbBanner banner){
		bannerMapper.updateByPrimaryKeySelective(banner);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbBanner findOne(Integer id){
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
	public PageResult findPage(TbBanner banner, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbBannerExample example=new TbBannerExample();
		Criteria criteria = example.createCriteria();
		
		if(banner!=null){			
				
		}
		
		Page<TbBanner> page= (Page<TbBanner>)bannerMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
