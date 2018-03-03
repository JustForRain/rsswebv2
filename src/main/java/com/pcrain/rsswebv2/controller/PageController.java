package com.pcrain.rsswebv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("index")
    public String IndexPage(){
        return "index";
    }
    @RequestMapping("admin")
    public String AdminPage(){
        return "admin";
    }
}
