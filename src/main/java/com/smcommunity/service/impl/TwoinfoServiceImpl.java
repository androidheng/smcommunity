package com.smcommunity.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smcommunity.mapper.TbTwoinfoMapper;
import com.smcommunity.pojo.TbTwoinfo;
import com.smcommunity.pojo.TbTwoinfoExample;
import com.smcommunity.pojo.TbTwoinfoExample.Criteria;
import com.smcommunity.service.TwoinfoService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class TwoinfoServiceImpl implements TwoinfoService {

	@Autowired
	private TbTwoinfoMapper twoinfoMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbTwoinfo> findAll() {
		return twoinfoMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbTwoinfo> page=   (Page<TbTwoinfo>) twoinfoMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbTwoinfo twoinfo) {
		twoinfoMapper.insert(twoinfo);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbTwoinfo twoinfo){
		twoinfoMapper.updateByPrimaryKey(twoinfo);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbTwoinfo findOne(Integer id){
		return twoinfoMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			twoinfoMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbTwoinfo twoinfo, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbTwoinfoExample example=new TbTwoinfoExample();
		Criteria criteria = example.createCriteria();
		
		if(twoinfo!=null){			
				
		}
		
		Page<TbTwoinfo> page= (Page<TbTwoinfo>)twoinfoMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
