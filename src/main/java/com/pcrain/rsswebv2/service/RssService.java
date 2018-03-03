package com.pcrain.rsswebv2.service;

import com.pcrain.rsswebv2.domain.vo.RssAdd;
import org.springframework.web.multipart.MultipartFile;

public interface RssService {
    int getUpdatingsize();

    void addRss(RssAdd rssAdd, MultipartFile file);
}
