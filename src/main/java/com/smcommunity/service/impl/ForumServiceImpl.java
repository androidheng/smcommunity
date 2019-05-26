package com.smcommunity.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smcommunity.mapper.TbForumMapper;
import com.smcommunity.pojo.TbForum;
import com.smcommunity.pojo.TbForumExample;
import com.smcommunity.pojo.TbForumExample.Criteria;
import com.smcommunity.service.ForumService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ForumServiceImpl implements ForumService {

	@Autowired
	private TbForumMapper forumMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbForum> findAll() {
		return forumMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbForum> page=   (Page<TbForum>) forumMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbForum forum) {
		forumMapper.insert(forum);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbForum forum){
		forumMapper.updateByPrimaryKey(forum);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbForum findOne(Integer id){
		return forumMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			forumMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbForum forum, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbForumExample example=new TbForumExample();
		Criteria criteria = example.createCriteria();
		
		if(forum!=null){			
				
		}
		
		Page<TbForum> page= (Page<TbForum>)forumMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
