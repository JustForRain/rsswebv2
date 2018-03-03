package com.pcrain.rsswebv2.mapper;

import com.pcrain.rsswebv2.domain.pojo.Down;
import com.pcrain.rsswebv2.domain.pojo.DownExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DownMapper {
    long countByExample(DownExample example);

    int deleteByExample(DownExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Down record);

    int insertSelective(Down record);

    List<Down> selectByExampleWithBLOBs(DownExample example);

    List<Down> selectByExample(DownExample example);

    Down selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Down record, @Param("example") DownExample example);

    int updateByExampleWithBLOBs(@Param("record") Down record, @Param("example") DownExample example);

    int updateByExample(@Param("record") Down record, @Param("example") DownExample example);

    int updateByPrimaryKeySelective(Down record);

    int updateByPrimaryKeyWithBLOBs(Down record);

    int updateByPrimaryKey(Down record);
}