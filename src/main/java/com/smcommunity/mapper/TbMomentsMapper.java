package com.smcommunity.mapper;

import com.github.pagehelper.Page;
import com.smcommunity.pojo.TbMoments;
import com.smcommunity.pojo.TbMomentsExample;

import entity.PageResult;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMomentsMapper {
    int countByExample(TbMomentsExample example);

    int deleteByExample(TbMomentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbMoments record);

    int insertSelective(TbMoments record);

    List<TbMoments> selectByExample(TbMomentsExample example);

    TbMoments selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbMoments record, @Param("example") TbMomentsExample example);

    int updateByExample(@Param("record") TbMoments record, @Param("example") TbMomentsExample example);

    int updateByPrimaryKeySelective(TbMoments record);

    int updateByPrimaryKey(TbMoments record);
    
    List<TbMoments> findBbs(@Param("newstype") String  newstype);

	List<TbMoments> findBbsNoKey();

	List<TbMoments> findPages(@Param("key") String key,@Param("startdate") String startdate,@Param("enddate") String enddate);

	List<TbMoments> findDetail(@Param("key") String key,@Param("date") String date);

	List<TbMoments> findType(@Param("uid") Integer uid);
	List<TbMoments> findRand(@Param("uid") Integer uid,@Param("newstype") String newstype);
}