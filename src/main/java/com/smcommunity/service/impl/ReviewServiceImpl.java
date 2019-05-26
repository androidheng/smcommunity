package com.smcommunity.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smcommunity.mapper.TbReviewMapper;
import com.smcommunity.pojo.TbReview;
import com.smcommunity.pojo.TbReviewExample;
import com.smcommunity.pojo.TbReviewExample.Criteria;
import com.smcommunity.service.ReviewService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private TbReviewMapper reviewMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbReview> findAll(int cid) {
		TbReviewExample example=new TbReviewExample();
		Criteria criteria = example.createCriteria();
		criteria.andCidEqualTo(cid);
		return reviewMapper.selectByExample(example);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbReview> page=   (Page<TbReview>) reviewMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbReview review) {
		reviewMapper.insert(review);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbReview review){
		reviewMapper.updateByPrimaryKey(review);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbReview findOne(Integer id){
		return reviewMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			reviewMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbReview review, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbReviewExample example=new TbReviewExample();
		Criteria criteria = example.createCriteria();
		
		if(review!=null){			
				
		}
		
		Page<TbReview> page= (Page<TbReview>)reviewMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
