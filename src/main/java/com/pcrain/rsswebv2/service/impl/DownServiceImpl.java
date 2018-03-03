package com.pcrain.rsswebv2.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pcrain.rsswebv2.dao.DownDao;
import com.pcrain.rsswebv2.domain.pojo.Down;
import com.pcrain.rsswebv2.domain.vo.LayUIDataGridResult;
import com.pcrain.rsswebv2.service.DownService;
import com.pcrain.rsswebv2.service.RssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DownServiceImpl implements DownService {
    @Autowired
    RssService rssService;
    @Autowired
    DownDao downDao;
    /**
     * 查询最近一周更新状况
     * @param page
     * @return
     */
    @Override
    public LayUIDataGridResult getRecentDown(Integer page) {
        //获取在更番剧数量
        int size=rssService.getUpdatingsize();
        PageHelper.startPage(page,size);
        List<Down> list=downDao.getRecentDown();
        PageInfo<Down> pageInfo=new PageInfo<>(list);
        Long total=pageInfo.getTotal();
        return new LayUIDataGridResult(total,list);
    }
}
