package com.smcommunity.mapper;

import com.smcommunity.pojo.TbReview;
import com.smcommunity.pojo.TbReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbReviewMapper {
    int countByExample(TbReviewExample example);

    int deleteByExample(TbReviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbReview record);

    int insertSelective(TbReview record);

    List<TbReview> selectByExample(TbReviewExample example);

    TbReview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbReview record, @Param("example") TbReviewExample example);

    int updateByExample(@Param("record") TbReview record, @Param("example") TbReviewExample example);

    int updateByPrimaryKeySelective(TbReview record);

    int updateByPrimaryKey(TbReview record);
}