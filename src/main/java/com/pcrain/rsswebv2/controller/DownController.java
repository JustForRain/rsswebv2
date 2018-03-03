package com.pcrain.rsswebv2.controller;

import com.pcrain.rsswebv2.domain.vo.LayUIDataGridResult;
import com.pcrain.rsswebv2.service.DownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("down")
public class DownController {
    @Autowired
    DownService downService;

    /**
     * 查询最近一周更新状况
     * @param page
     * @return
     */
    @RequestMapping("recent")
    public LayUIDataGridResult getRecentDown(@RequestParam(defaultValue = "1")Integer page){
        LayUIDataGridResult result=downService.getRecentDown(page);
        return result;
    }
}
