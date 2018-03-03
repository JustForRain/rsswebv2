package com.pcrain.rsswebv2.mapper;

import com.pcrain.rsswebv2.domain.pojo.Rss;
import com.pcrain.rsswebv2.domain.pojo.RssExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RssMapper {
    long countByExample(RssExample example);

    int deleteByExample(RssExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Rss record);

    int insertSelective(Rss record);

    List<Rss> selectByExample(RssExample example);

    Rss selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Rss record, @Param("example") RssExample example);

    int updateByExample(@Param("record") Rss record, @Param("example") RssExample example);

    int updateByPrimaryKeySelective(Rss record);

    int updateByPrimaryKey(Rss record);
}