package com.smcommunity.mapper;

import com.smcommunity.pojo.TbRetype;
import com.smcommunity.pojo.TbRetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRetypeMapper {
    int countByExample(TbRetypeExample example);

    int deleteByExample(TbRetypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbRetype record);

    int insertSelective(TbRetype record);

    List<TbRetype> selectByExample(TbRetypeExample example);

    TbRetype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbRetype record, @Param("example") TbRetypeExample example);

    int updateByExample(@Param("record") TbRetype record, @Param("example") TbRetypeExample example);

    int updateByPrimaryKeySelective(TbRetype record);

    int updateByPrimaryKey(TbRetype record);
}