package com.pcrain.rsswebv2.controller;

import com.pcrain.rsswebv2.domain.AjaxResult;
import com.pcrain.rsswebv2.domain.vo.RssAdd;
import com.pcrain.rsswebv2.service.RssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("rss")
public class RssController {
    @Autowired
    RssService rssService;
    @RequestMapping("add")
    @ResponseBody
    public AjaxResult add(RssAdd rssAdd, BindingResult bindingResult, @RequestParam("img")MultipartFile file){
        AjaxResult ajaxResult=new AjaxResult();
        if(bindingResult.hasErrors()){
            List<ObjectError> errors=bindingResult.getAllErrors();
            StringBuffer stringBuffer=new StringBuffer();
            for(ObjectError error:errors){
                stringBuffer.append(error.getDefaultMessage());
                stringBuffer.append("，");
            }
            stringBuffer.deleteCharAt(stringBuffer.length()-1);
            ajaxResult.setStatus(400);
            ajaxResult.setMsg(stringBuffer.toString());
        }else if(!file.isEmpty()){
            rssService.addRss(rssAdd,file);
            ajaxResult.setStatus(200);
            ajaxResult.setMsg("添加成功");
        }
        return ajaxResult;
    }
}
