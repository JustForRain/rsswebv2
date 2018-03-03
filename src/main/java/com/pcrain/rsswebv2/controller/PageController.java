package com.pcrain.rsswebv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    /**
     * 首页跳转
     * @return
     */
    @RequestMapping("index")
    public String IndexPage(){
        return "index";
    }

    /**
     * 管理页跳转
     * @return
     */
    @RequestMapping("admin")
    public String AdminPage(){
        return "admin";
    }
}
