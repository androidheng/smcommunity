package com.smcommunity.mapper;

import com.smcommunity.pojo.TbGoodsuser;
import com.smcommunity.pojo.TbGoodsuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGoodsuserMapper {
    int countByExample(TbGoodsuserExample example);

    int deleteByExample(TbGoodsuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbGoodsuser record);

    int insertSelective(TbGoodsuser record);

    List<TbGoodsuser> selectByExample(TbGoodsuserExample example);

    TbGoodsuser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbGoodsuser record, @Param("example") TbGoodsuserExample example);

    int updateByExample(@Param("record") TbGoodsuser record, @Param("example") TbGoodsuserExample example);

    int updateByPrimaryKeySelective(TbGoodsuser record);

    int updateByPrimaryKey(TbGoodsuser record);
}