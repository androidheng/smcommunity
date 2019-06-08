package com.smcommunity.mapper;

import com.github.pagehelper.Page;
import com.smcommunity.pojo.TbSentiment;
import com.smcommunity.pojo.TbSentimentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSentimentMapper {
    int countByExample(TbSentimentExample example);

    int deleteByExample(TbSentimentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSentiment record);

    int insertSelective(TbSentiment record);

    List<TbSentiment> selectByExample(TbSentimentExample example);

    TbSentiment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSentiment record, @Param("example") TbSentimentExample example);

    int updateByExample(@Param("record") TbSentiment record, @Param("example") TbSentimentExample example);

    int updateByPrimaryKeySelective(TbSentiment record);

    int updateByPrimaryKey(TbSentiment record);

	List<TbSentiment> findAll();
}