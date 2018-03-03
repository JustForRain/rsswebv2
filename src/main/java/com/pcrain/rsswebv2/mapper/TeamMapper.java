package com.pcrain.rsswebv2.mapper;

import com.pcrain.rsswebv2.domain.pojo.Team;
import com.pcrain.rsswebv2.domain.pojo.TeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamMapper {
    long countByExample(TeamExample example);

    int deleteByExample(TeamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Team record);

    int insertSelective(Team record);

    List<Team> selectByExample(TeamExample example);

    Team selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByExample(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}