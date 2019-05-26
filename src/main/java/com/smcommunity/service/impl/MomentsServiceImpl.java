package com.smcommunity.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smcommunity.mapper.TbMomentsMapper;
import com.smcommunity.pojo.TbMoments;
import com.smcommunity.pojo.TbMomentsExample;
import com.smcommunity.pojo.TbMomentsExample.Criteria;
import com.smcommunity.service.MomentsService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class MomentsServiceImpl implements MomentsService {

	@Autowired
	private TbMomentsMapper momentsMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbMoments> findAll(String key) {
		if(StringUtils.isEmpty(key)) {
			return momentsMapper.selectByExample(null);
		}else {
			TbMomentsExample example=new TbMomentsExample();
			Criteria criteria = example.createCriteria();
			criteria.andNewstypeEqualTo(key);
			return momentsMapper.selectByExample(example);	
		}
		
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbMoments> page=   (Page<TbMoments>) momentsMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbMoments moments) {
		momentsMapper.insert(moments);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbMoments moments){
		momentsMapper.updateByPrimaryKeySelective(moments);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbMoments findOne(Integer id){
		return momentsMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			momentsMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbMoments moments, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbMomentsExample example=new TbMomentsExample();
		Criteria criteria = example.createCriteria();
		
		if(moments!=null){			
				
		}
		
		Page<TbMoments> page= (Page<TbMoments>)momentsMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public List<TbMoments> findMyComents(int uid) {
			TbMomentsExample example=new TbMomentsExample();
			Criteria criteria = example.createCriteria();
			criteria.andUidEqualTo(uid);
			
			return momentsMapper.selectByExample(example);	
		}

		@Override
		public List<TbMoments> findMyAll(String uid) {
			
			return null;
		}
	
}
