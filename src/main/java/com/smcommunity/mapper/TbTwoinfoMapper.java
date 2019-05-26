package com.smcommunity.mapper;

import com.smcommunity.pojo.TbTwoinfo;
import com.smcommunity.pojo.TbTwoinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTwoinfoMapper {
    int countByExample(TbTwoinfoExample example);

    int deleteByExample(TbTwoinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbTwoinfo record);

    int insertSelective(TbTwoinfo record);

    List<TbTwoinfo> selectByExample(TbTwoinfoExample example);

    TbTwoinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbTwoinfo record, @Param("example") TbTwoinfoExample example);

    int updateByExample(@Param("record") TbTwoinfo record, @Param("example") TbTwoinfoExample example);

    int updateByPrimaryKeySelective(TbTwoinfo record);

    int updateByPrimaryKey(TbTwoinfo record);
}