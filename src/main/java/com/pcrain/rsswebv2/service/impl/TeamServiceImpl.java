package com.pcrain.rsswebv2.service.impl;

import com.pcrain.rsswebv2.dao.TeamDao;
import com.pcrain.rsswebv2.domain.AjaxResult;
import com.pcrain.rsswebv2.domain.pojo.Team;
import com.pcrain.rsswebv2.service.TeamService;
import com.pcrain.rsswebv2.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    TeamDao teamDao;
    @Override
    public AjaxResult addTeam(String name) {
        Team record=new Team();
        record.setName(name);
        try{
            teamDao.addTeam(record);
            return new AjaxResult(200,"添加成功",null);
        }catch (Exception e){
            return new AjaxResult(500,"添加失败",null);
        }
    }

    @Override
    public AjaxResult deleteTeams(String ids) {
        Long[] keys= StringUtil.getNumList(ids);
        try {
            for (int i = 0; i < keys.length; i++) {
                teamDao.deleteByPrimaryKey(keys[i]);
            }
            return new AjaxResult(200, "删除成功", null);
        }catch (Exception e){
            return new AjaxResult(500,"删除失败",null);
        }
    }

    @Override
    public AjaxResult updateTeam(Long key, String name) {
        Team record=new Team();
        record.setId(key);
        record.setName(name);
        try{
            teamDao.updateTeam(record);
            return new AjaxResult(200,"更新成功",null);
        }catch (Exception e){
            return new AjaxResult(500,"更新错误",null);
        }
    }

    @Override
    public AjaxResult getTeam(String name) {
        List<Team> result=teamDao.getTeam(name);
        return new AjaxResult(200,"实时搜索",result);
    }
}
