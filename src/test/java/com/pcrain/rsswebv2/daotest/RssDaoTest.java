package com.pcrain.rsswebv2.daotest;

import com.pcrain.rsswebv2.CommonTest;
import com.pcrain.rsswebv2.dao.RssDao;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RssDaoTest extends CommonTest {
    @Autowired
    RssDao rssDao;
    @Test
    public void getUpdatingSize(){
        Integer size=rssDao.getUpdatingSize();
        Assert.assertTrue(size>0);
    }
}
