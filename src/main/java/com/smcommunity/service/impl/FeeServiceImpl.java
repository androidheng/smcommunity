package com.smcommunity.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smcommunity.mapper.TbFeeMapper;
import com.smcommunity.pojo.TbFee;
import com.smcommunity.pojo.TbFeeExample;
import com.smcommunity.pojo.TbFeeExample.Criteria;
import com.smcommunity.service.FeeService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class FeeServiceImpl implements FeeService {

	@Autowired
	private TbFeeMapper feeMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbFee> findAll() {
		return feeMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbFee> page=   (Page<TbFee>) feeMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbFee fee) {
		feeMapper.insert(fee);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbFee fee){
		feeMapper.updateByPrimaryKey(fee);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbFee findOne(Integer id){
		return feeMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			feeMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbFee fee, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbFeeExample example=new TbFeeExample();
		Criteria criteria = example.createCriteria();
		
		if(fee!=null){			
				
		}
		
		Page<TbFee> page= (Page<TbFee>)feeMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
