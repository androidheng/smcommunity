package com.smcommunity.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smcommunity.mapper.TbRepairMapper;
import com.smcommunity.pojo.TbRepair;
import com.smcommunity.pojo.TbRepairExample;
import com.smcommunity.pojo.TbRepairExample.Criteria;
import com.smcommunity.service.RepairService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class RepairServiceImpl implements RepairService {

	@Autowired
	private TbRepairMapper repairMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbRepair> findAll() {
		return repairMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbRepair> page=   (Page<TbRepair>) repairMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbRepair repair) {
		repairMapper.insert(repair);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbRepair repair){
		repairMapper.updateByPrimaryKeySelective(repair);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbRepair findOne(Integer id){
		return repairMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			repairMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbRepair repair, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbRepairExample example=new TbRepairExample();
		Criteria criteria = example.createCriteria();
		
		if(repair!=null){			
				
		}
		
		Page<TbRepair> page= (Page<TbRepair>)repairMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
