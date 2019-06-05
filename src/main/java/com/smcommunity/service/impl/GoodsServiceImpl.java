package com.smcommunity.service.impl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smcommunity.mapper.TbGoodsMapper;
import com.smcommunity.mapper.TbRecomuidMapper;
import com.smcommunity.pojo.TbGoods;
import com.smcommunity.pojo.TbGoodsExample;
import com.smcommunity.pojo.TbGoodsExample.Criteria;
import com.smcommunity.pojo.TbRecomuid;
import com.smcommunity.pojo.TbRecomuidExample;
import com.smcommunity.service.GoodsService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private TbGoodsMapper goodsMapper;
	@Autowired
	private TbRecomuidMapper recomuidMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbGoods> findAll() {
		return goodsMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbGoods> page=   (Page<TbGoods>) goodsMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbGoods goods) {
		goodsMapper.insert(goods);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbGoods goods){
		goodsMapper.updateByPrimaryKey(goods);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbGoods findOne(Integer id){
		return goodsMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer id) {
		goodsMapper.deleteByPrimaryKey(id);
	}
	
	
		@Override
	public PageResult findPage(TbGoods goods, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbGoodsExample example=new TbGoodsExample();
		Criteria criteria = example.createCriteria();
		
		if(goods!=null){			
			if(goods.getGoodsname()!=null) {
				criteria.andGoodsnameEqualTo(goods.getGoodsname());
			}	
			if(goods.getGoodstype()!=null) {
				criteria.andGoodstypeEqualTo(goods.getGoodstype());
			}	
		}
		
		Page<TbGoods> page= (Page<TbGoods>)goodsMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public List<TbGoods> findGuanGao() {
			TbGoodsExample example=new TbGoodsExample();
			Criteria criteria = example.createCriteria();
			
			criteria.andGoodstypeEqualTo(1);
			
			return goodsMapper.selectByExample(example);		
		}

		@Override
		public List<TbGoods> findShouAll() {
			TbGoodsExample example=new TbGoodsExample();
			Criteria criteria = example.createCriteria();
			
			criteria.andGoodstypeEqualTo(0);
			
			return goodsMapper.selectByExample(example);		
		}

		@Override
		public List<TbGoods> recommendAll(String uid) {
			TbRecomuidExample example=new TbRecomuidExample();
			com.smcommunity.pojo.TbRecomuidExample.Criteria criteria = example.createCriteria();
			criteria.andUidEqualTo(Integer.parseInt(uid));
			List<TbRecomuid> list = recomuidMapper.selectByExample(example);
			if(list.size()==0)
				return new ArrayList<>();
			List<TbGoods> resultList=new ArrayList<>();
			String str=list.get(0).getMaxtname();
			String[] split = str.split(",");
			for (String s : split) {
				resultList.addAll(goodsMapper.recommendAll(s));
			}
			return resultList;
		}
	
}
