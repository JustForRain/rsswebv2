package com.pcrain.rsswebv2.dao;

import com.pcrain.rsswebv2.domain.pojo.Team;

import java.util.List;

public interface TeamDao {
    void addTeam(Team record);

    void deleteByPrimaryKey(Long key);

    void updateTeam(Team record);

    List<Team> getTeam(String name);
}
