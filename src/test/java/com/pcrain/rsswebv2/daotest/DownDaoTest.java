package com.pcrain.rsswebv2.daotest;

import com.pcrain.rsswebv2.CommonTest;
import com.pcrain.rsswebv2.dao.DownDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DownDaoTest extends CommonTest {
    @Autowired
    DownDao downDao;
    @Test
    public void getRecent(){
        System.out.println(downDao.getRecentDown().size());
    }
}
