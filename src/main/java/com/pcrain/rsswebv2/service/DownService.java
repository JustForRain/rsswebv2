package com.pcrain.rsswebv2.service;

import com.pcrain.rsswebv2.domain.vo.LayUIDataGridResult;

public interface DownService {
    LayUIDataGridResult getRecentDown(Integer page);
}
