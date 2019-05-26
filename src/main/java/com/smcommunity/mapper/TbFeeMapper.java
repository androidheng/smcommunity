package com.smcommunity.mapper;

import com.smcommunity.pojo.TbFee;
import com.smcommunity.pojo.TbFeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFeeMapper {
    int countByExample(TbFeeExample example);

    int deleteByExample(TbFeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbFee record);

    int insertSelective(TbFee record);

    List<TbFee> selectByExample(TbFeeExample example);

    TbFee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbFee record, @Param("example") TbFeeExample example);

    int updateByExample(@Param("record") TbFee record, @Param("example") TbFeeExample example);

    int updateByPrimaryKeySelective(TbFee record);

    int updateByPrimaryKey(TbFee record);
}