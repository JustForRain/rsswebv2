package com.pcrain.rsswebv2.util;

public class StringUtil {
    public static Long[] getNumList(String num) {
        String[] str=num.split(",");
        Long[] ids=new Long[str.length];
        for(int i=0;i<str.length;i++){
            ids[i]=Long.valueOf(str[i]);
        }
        return ids;
    }
}
