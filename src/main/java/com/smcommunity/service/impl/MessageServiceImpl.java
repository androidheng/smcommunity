package com.smcommunity.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smcommunity.mapper.TbMessageMapper;
import com.smcommunity.pojo.TbMessage;
import com.smcommunity.pojo.TbMessageExample;
import com.smcommunity.pojo.TbMessageExample.Criteria;
import com.smcommunity.service.MessageService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private TbMessageMapper messageMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbMessage> findAll() {
		return messageMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbMessage> page=   (Page<TbMessage>) messageMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbMessage message) {
		messageMapper.insert(message);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbMessage message){
		messageMapper.updateByPrimaryKeySelective(message);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbMessage findOne(Integer id){
		return messageMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			messageMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbMessage message, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbMessageExample example=new TbMessageExample();
		Criteria criteria = example.createCriteria();
		
		if(message!=null){			
			if(message.getTitle()!=null){
				criteria.andTitleLike("%"+message.getTitle()+"%");
			}
		}
		
		Page<TbMessage> page= (Page<TbMessage>)messageMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public List<TbMessage> findShou() {
			
			List<TbMessage> list=messageMapper.findShou();
			return list;		
		}
	
}
