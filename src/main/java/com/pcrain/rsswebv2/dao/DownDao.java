package com.pcrain.rsswebv2.dao;

import com.pcrain.rsswebv2.domain.pojo.Down;

import java.util.List;

public interface DownDao {
    List<Down> getRecentDown();
}
