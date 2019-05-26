package com.smcommunity.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smcommunity.mapper.TbUsersMapper;
import com.smcommunity.pojo.TbUsers;
import com.smcommunity.pojo.TbUsersExample;
import com.smcommunity.pojo.TbUsersExample.Criteria;
import com.smcommunity.service.UsersService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private TbUsersMapper usersMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbUsers> findAll() {
		return usersMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbUsers> page=   (Page<TbUsers>) usersMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbUsers users) {
		usersMapper.insert(users);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbUsers users){
		usersMapper.updateByPrimaryKeySelective(users);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbUsers findOne(Integer id){
		return usersMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			usersMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbUsers users, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbUsersExample example=new TbUsersExample();
		Criteria criteria = example.createCriteria();
		
		if(users!=null){			
			criteria.andNameLike("%"+users.getName()+"%");
		}
		
		Page<TbUsers> page= (Page<TbUsers>)usersMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

		@Override
		public TbUsers login(TbUsers users) {
			TbUsersExample example=new TbUsersExample();
			Criteria criteria = example.createCriteria();
			
			if(users!=null){			
				criteria.andPhoneEqualTo(users.getPhone());
				criteria.andPasswordEqualTo(users.getPassword());
			}
			List<TbUsers> list = usersMapper.selectByExample(example);
			if(list.size()>0)
				return list.get(0);
			return null;
		}
	
}
