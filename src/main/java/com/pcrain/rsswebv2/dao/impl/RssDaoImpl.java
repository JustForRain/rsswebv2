package com.pcrain.rsswebv2.dao.impl;

import com.pcrain.rsswebv2.dao.RssDao;
import com.pcrain.rsswebv2.domain.pojo.Rss;
import com.pcrain.rsswebv2.domain.pojo.RssExample;
import com.pcrain.rsswebv2.mapper.RssMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RssDaoImpl implements RssDao{
    @Autowired
    RssMapper rssMapper;

    /**
     * 获取在更番剧总数
     * @return
     */
    @Override
    public int getUpdatingSize() {
        RssExample example=new RssExample();
        RssExample.Criteria criteria=example.createCriteria();
        criteria.andParentIdEqualTo(1L);
        return rssMapper.selectByExample(example).size();
    }

    @Override
    public void addRecord(Rss rss) {
        rssMapper.insert(rss);
    }
}