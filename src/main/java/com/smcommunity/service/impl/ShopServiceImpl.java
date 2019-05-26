package com.smcommunity.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smcommunity.mapper.TbShopMapper;
import com.smcommunity.pojo.TbShop;
import com.smcommunity.pojo.TbShopExample;
import com.smcommunity.pojo.TbShopExample.Criteria;
import com.smcommunity.service.ShopService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	private TbShopMapper shopMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbShop> findAll() {
		return shopMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbShop> page=   (Page<TbShop>) shopMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbShop shop) {
		shopMapper.insert(shop);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbShop shop){
		shopMapper.updateByPrimaryKey(shop);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbShop findOne(Integer id){
		return shopMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			shopMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbShop shop, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbShopExample example=new TbShopExample();
		Criteria criteria = example.createCriteria();
		
		if(shop!=null){			
				
		}
		
		Page<TbShop> page= (Page<TbShop>)shopMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
