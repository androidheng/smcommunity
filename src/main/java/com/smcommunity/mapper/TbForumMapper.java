package com.smcommunity.mapper;

import com.smcommunity.pojo.TbForum;
import com.smcommunity.pojo.TbForumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbForumMapper {
    int countByExample(TbForumExample example);

    int deleteByExample(TbForumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbForum record);

    int insertSelective(TbForum record);

    List<TbForum> selectByExample(TbForumExample example);

    TbForum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbForum record, @Param("example") TbForumExample example);

    int updateByExample(@Param("record") TbForum record, @Param("example") TbForumExample example);

    int updateByPrimaryKeySelective(TbForum record);

    int updateByPrimaryKey(TbForum record);
}