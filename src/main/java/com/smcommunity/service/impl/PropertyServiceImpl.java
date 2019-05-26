package com.smcommunity.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smcommunity.mapper.TbPropertyMapper;
import com.smcommunity.pojo.TbProperty;
import com.smcommunity.pojo.TbPropertyExample;
import com.smcommunity.pojo.TbPropertyExample.Criteria;
import com.smcommunity.service.PropertyService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	private TbPropertyMapper propertyMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbProperty> findAll() {
		return propertyMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbProperty> page=   (Page<TbProperty>) propertyMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbProperty property) {
		propertyMapper.insert(property);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbProperty property){
		propertyMapper.updateByPrimaryKey(property);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbProperty findOne(Integer id){
		return propertyMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			propertyMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbProperty property, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbPropertyExample example=new TbPropertyExample();
		Criteria criteria = example.createCriteria();
		
		if(property!=null){			
				
		}
		
		Page<TbProperty> page= (Page<TbProperty>)propertyMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
