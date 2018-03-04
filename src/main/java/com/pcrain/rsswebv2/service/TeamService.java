package com.pcrain.rsswebv2.service;

import com.pcrain.rsswebv2.domain.AjaxResult;

public interface TeamService {
    AjaxResult addTeam(String name);

    AjaxResult deleteTeams(String ids);

    AjaxResult updateTeam(Long key, String name);

    AjaxResult getTeam(String name);
}
