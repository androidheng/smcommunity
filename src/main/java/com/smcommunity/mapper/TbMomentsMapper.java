package com.smcommunity.mapper;

import com.smcommunity.pojo.TbMoments;
import com.smcommunity.pojo.TbMomentsExample;
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
}