package com.pcrain.rsswebv2.service.impl;

import com.pcrain.rsswebv2.dao.RssDao;
import com.pcrain.rsswebv2.domain.pojo.Rss;
import com.pcrain.rsswebv2.domain.vo.RssAdd;
import com.pcrain.rsswebv2.service.RssService;
import com.pcrain.rsswebv2.util.QiNiuYun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Calendar;

@Service
public class RssServiceImpl implements RssService {
    @Autowired
    RssDao rssDao;
    @Autowired
    private QiNiuYun qiNiuYun;
    /**
     * 获取在更番剧数量
     * @return
     */
    @Override
    public int getUpdatingsize() {
        return rssDao.getUpdatingSize();
    }

    @Override
    public void addRss(RssAdd rssAdd, MultipartFile file) {
        Rss rss=new Rss();
        Long parentId=rssAdd.getStatus()==1?1L:2L;//番剧状态
        rss.setParentId(parentId);//番剧状态
        rss.setName(rssAdd.getName());//番剧名称
        rss.setTeamId(rssAdd.getTeamId());//字幕组ID
        rss.setQuality(rssAdd.getQuality());//番剧分辨率
        rss.setSerialDate(rssAdd.getDate());//首发日期
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(rssAdd.getDate());
        int today=calendar.get(Calendar.DAY_OF_WEEK-1);
        rss.setDay(today);
        rss.setUrl(rssAdd.getUrl());//Rss地址
        //将 img的图片上传到七牛云 并将七牛云的连接存储到localimg
        try {
            String img= qiNiuYun.upload(file.getBytes());
            rss.setImg(img);
        } catch (IOException e) {
            e.printStackTrace();
        }
        rssDao.addRecord(rss);
    }
}
