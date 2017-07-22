package com.baomidou.springmvc.platform.constant;

/**
 * Created by maohua on 2017/7/13.
 */
public enum DBSourceEnum {
    SOURCE_MYBATIS("mybatisDataSource"),
    SOURCE_ORDER("orderDataSource");

    DBSourceEnum(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
