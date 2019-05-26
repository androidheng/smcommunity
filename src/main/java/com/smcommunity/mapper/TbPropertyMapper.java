package com.smcommunity.mapper;

import com.smcommunity.pojo.TbProperty;
import com.smcommunity.pojo.TbPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPropertyMapper {
    int countByExample(TbPropertyExample example);

    int deleteByExample(TbPropertyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbProperty record);

    int insertSelective(TbProperty record);

    List<TbProperty> selectByExample(TbPropertyExample example);

    TbProperty selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbProperty record, @Param("example") TbPropertyExample example);

    int updateByExample(@Param("record") TbProperty record, @Param("example") TbPropertyExample example);

    int updateByPrimaryKeySelective(TbProperty record);

    int updateByPrimaryKey(TbProperty record);
}