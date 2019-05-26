package com.smcommunity.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smcommunity.mapper.TbWordsMapper;
import com.smcommunity.pojo.TbWords;
import com.smcommunity.pojo.TbWordsExample;
import com.smcommunity.pojo.TbWordsExample.Criteria;
import com.smcommunity.service.WordsService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class WordsServiceImpl implements WordsService {

	@Autowired
	private TbWordsMapper wordsMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbWords> findAll() {
		return wordsMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbWords> page=   (Page<TbWords>) wordsMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbWords users) {
		wordsMapper.insert(users);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbWords users){
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbWords findOne(Integer id){
		return null;
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		/*for(Integer id:ids){
			usersMapper.deleteByPrimaryKey(id);
		}*/		
	}
	
	
		@Override
	public PageResult findPage(TbWords users, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbWordsExample example=new TbWordsExample();
		Criteria criteria = example.createCriteria();
		
		if(users!=null){			
//			criteria.andNameLike("%"+users.getName()+"%");
		}
		
		Page<TbWords> page= (Page<TbWords>)wordsMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public List<TbWords> findAll(String name) {
			TbWordsExample example=new TbWordsExample();
			Criteria criteria = example.createCriteria();
			criteria.andTnameEqualTo(name);
			return wordsMapper.selectByExample(example);
		}

	
}
