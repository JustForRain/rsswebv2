package com.pcrain.rsswebv2.dao.impl;

import com.pcrain.rsswebv2.dao.TeamDao;
import com.pcrain.rsswebv2.domain.pojo.Team;
import com.pcrain.rsswebv2.domain.pojo.TeamExample;
import com.pcrain.rsswebv2.mapper.TeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeamDaoImpl implements TeamDao{
    @Autowired
    TeamMapper teamMapper;

    @Override
    public void addTeam(Team record) {
        teamMapper.insert(record);
    }

    @Override
    public void deleteByPrimaryKey(Long key) {
        teamMapper.deleteByPrimaryKey(key);
    }

    @Override
    public void updateTeam(Team record) {
        teamMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Team> getTeam(String name) {
        TeamExample example=new TeamExample();
        TeamExample.Criteria criteria=example.createCriteria();
        criteria.andNameLike("%"+name+"%");
        return teamMapper.selectByExample(example);
    }
}
