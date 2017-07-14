package com.baomidou.springmvc.platform.constant;

/**
 * Created by maohua on 2017/7/13.
 */
public enum DBSourceEnum {
    SOURCE_MP("mPlusDs"),
    SOURCE_ORDER("orderDs");

    DBSourceEnum(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
