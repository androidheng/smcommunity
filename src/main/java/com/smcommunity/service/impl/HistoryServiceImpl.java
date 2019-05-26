package com.smcommunity.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smcommunity.mapper.TbGoodsMapper;
import com.smcommunity.mapper.TbHistoryMapper;
import com.smcommunity.pojo.TbGoods;
import com.smcommunity.pojo.TbHistory;
import com.smcommunity.pojo.TbHistoryExample;
import com.smcommunity.pojo.TbHistoryExample.Criteria;
import com.smcommunity.service.HistoryService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class HistoryServiceImpl implements HistoryService {

	@Autowired
	private TbHistoryMapper historyMapper;
	@Autowired
	private TbGoodsMapper goodsMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbGoods> findAll(int uid) {
		return goodsMapper.findHistory(uid);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbHistory> page=   (Page<TbHistory>) historyMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbHistory history) {
		historyMapper.insert(history);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbHistory history){
		historyMapper.updateByPrimaryKey(history);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbHistory findOne(Integer id){
		return historyMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			historyMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbHistory history, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbHistoryExample example=new TbHistoryExample();
		Criteria criteria = example.createCriteria();
		
		if(history!=null){			
				
		}
		
		Page<TbHistory> page= (Page<TbHistory>)historyMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public TbHistory findHistory(TbHistory history) {
			TbHistoryExample example=new TbHistoryExample();
			Criteria criteria = example.createCriteria();
			
			if(history!=null){			
				criteria.andGidEqualTo(history.getGid());
				criteria.andUidEqualTo(history.getUid());
			}
			List<TbHistory> list = historyMapper.selectByExample(example);
			if(list.size()>0)
				return list.get(0);
			return null;		
		}
	
}
