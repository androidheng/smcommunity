package com.smcommunity.mapper;

import com.smcommunity.pojo.TbRecomuid;
import com.smcommunity.pojo.TbRecomuidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRecomuidMapper {
    int countByExample(TbRecomuidExample example);

    int deleteByExample(TbRecomuidExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbRecomuid record);

    int insertSelective(TbRecomuid record);

    List<TbRecomuid> selectByExample(TbRecomuidExample example);

    TbRecomuid selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbRecomuid record, @Param("example") TbRecomuidExample example);

    int updateByExample(@Param("record") TbRecomuid record, @Param("example") TbRecomuidExample example);

    int updateByPrimaryKeySelective(TbRecomuid record);

    int updateByPrimaryKey(TbRecomuid record);
}