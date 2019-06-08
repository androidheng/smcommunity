package com.smcommunity.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smcommunity.mapper.TbSentimentMapper;
import com.smcommunity.pojo.TbSentiment;
import com.smcommunity.pojo.TbSentimentExample;
import com.smcommunity.pojo.TbSentimentExample.Criteria;
import com.smcommunity.service.BannerService;
import com.smcommunity.service.SentimentService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SentimentServiceImpl implements SentimentService {

	@Autowired
	private TbSentimentMapper bannerMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbSentiment> findAll() {
		return bannerMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbSentiment> page=   (Page<TbSentiment>) bannerMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbSentiment banner) {
		bannerMapper.insert(banner);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbSentiment banner){
		bannerMapper.updateByPrimaryKeySelective(banner);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbSentiment findOne(Integer id){
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
	public PageResult findPage(TbSentiment banner, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbSentimentExample example=new TbSentimentExample();
		
		Page<TbSentiment> page= (Page<TbSentiment>)bannerMapper.findAll();		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
