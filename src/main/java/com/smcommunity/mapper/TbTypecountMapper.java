package com.smcommunity.mapper;

import com.smcommunity.pojo.TbTypecount;
import com.smcommunity.pojo.TbTypecountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTypecountMapper {
    int countByExample(TbTypecountExample example);

    int deleteByExample(TbTypecountExample example);

    int insert(TbTypecount record);

    int insertSelective(TbTypecount record);

    List<TbTypecount> selectByExample(TbTypecountExample example);

    int updateByExampleSelective(@Param("record") TbTypecount record, @Param("example") TbTypecountExample example);

    int updateByExample(@Param("record") TbTypecount record, @Param("example") TbTypecountExample example);
}