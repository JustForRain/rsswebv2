package com.pcrain.rsswebv2.domain.pojo;

import java.util.Date;

public class Down {
    private Long id;

    private Long rssid;

    private String title;

    private Date pubdate;

    private String author;

    private String downloadurl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRssid() {
        return rssid;
    }

    public void setRssid(Long rssid) {
        this.rssid = rssid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getDownloadurl() {
        return downloadurl;
    }

    public void setDownloadurl(String downloadurl) {
        this.downloadurl = downloadurl == null ? null : downloadurl.trim();
    }
}