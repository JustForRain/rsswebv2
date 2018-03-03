package com.pcrain.rsswebv2.dao.impl;

import com.pcrain.rsswebv2.dao.DownDao;
import com.pcrain.rsswebv2.domain.pojo.Down;
import com.pcrain.rsswebv2.domain.pojo.DownExample;
import com.pcrain.rsswebv2.mapper.DownMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Repository
public class DownDaoImpl implements DownDao {
    @Autowired
    DownMapper downMapper;
    /**
     * 获取最近一周更新情况
     * @return
     */
    @Override
    public List<Down> getRecentDown() {
        DownExample example=new DownExample();
        DownExample.Criteria criteria=example.createCriteria();
        example.setOrderByClause("pubdate desc");
        Date end=new Date();
        Calendar now= Calendar.getInstance();
        now.add(Calendar.DATE,-7);
        Date start=now.getTime();
        criteria.andPubdateBetween(start,end);
        return downMapper.selectByExampleWithBLOBs(example);
    }

    /**
     * 根据RssId查找下载记录
     * @param rssId
     * @return
     */
    @Override
    public List<Down> getRecordByRssId(Long rssId) {
        DownExample example=new DownExample();
        DownExample.Criteria criteria=example.createCriteria();
        criteria.andRssidEqualTo(rssId);
        return downMapper.selectByExampleWithBLOBs(example);
    }
}
