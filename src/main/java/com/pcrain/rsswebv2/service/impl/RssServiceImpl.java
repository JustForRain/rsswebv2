package com.pcrain.rsswebv2.service.impl;

import com.pcrain.rsswebv2.dao.RssDao;
import com.pcrain.rsswebv2.service.RssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RssServiceImpl implements RssService {
    @Autowired
    RssDao rssDao;

    /**
     * 获取在更番剧数量
     * @return
     */
    @Override
    public int getUpdatingsize() {
        return rssDao.getUpdatingSize();
    }
}
