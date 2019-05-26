package com.smcommunity.mapper;

import com.smcommunity.pojo.TbMessage;
import com.smcommunity.pojo.TbMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMessageMapper {
    int countByExample(TbMessageExample example);

    int deleteByExample(TbMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbMessage record);

    int insertSelective(TbMessage record);

    List<TbMessage> selectByExample(TbMessageExample example);

    TbMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbMessage record, @Param("example") TbMessageExample example);

    int updateByExample(@Param("record") TbMessage record, @Param("example") TbMessageExample example);

    int updateByPrimaryKeySelective(TbMessage record);

    int updateByPrimaryKey(TbMessage record);

	List<TbMessage> findShou();
}