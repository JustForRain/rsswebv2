package com.pcrain.rsswebv2.dao;

import com.pcrain.rsswebv2.domain.pojo.Rss;

public interface RssDao {
    int getUpdatingSize();

    void addRecord(Rss rss);
}
