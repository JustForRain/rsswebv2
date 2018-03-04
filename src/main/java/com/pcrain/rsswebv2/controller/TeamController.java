package com.pcrain.rsswebv2.controller;

import com.pcrain.rsswebv2.domain.AjaxResult;
import com.pcrain.rsswebv2.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("team")
public class TeamController {
    @Autowired
    TeamService teamService;
    @ResponseBody
    @RequestMapping("add")
    public AjaxResult add(String name){
        return teamService.addTeam(name);
    }
    @ResponseBody
    @RequestMapping("delete")
    public AjaxResult delete(String ids){
        return teamService.deleteTeams(ids);
    }
    @ResponseBody
    @RequestMapping("update")
    public AjaxResult update(Long key,String name){
        return teamService.updateTeam(key,name);
    }
    @ResponseBody
    @RequestMapping("get")
    public AjaxResult get(@RequestParam(defaultValue = "") String name){
        return teamService.getTeam(name);
    }
}
