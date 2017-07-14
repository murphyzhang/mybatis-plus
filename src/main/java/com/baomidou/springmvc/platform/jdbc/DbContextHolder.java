package com.baomidou.springmvc.platform.jdbc;

import com.baomidou.springmvc.platform.constant.DBSourceEnum;

/**
 * Created by maohua on 2017/7/13.
 */
public class DbContextHolder {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    /**
     * 设置数据源
     * @param dbSourceEnum
     */
    public static void setDbType(DBSourceEnum dbSourceEnum) {
        contextHolder.set(dbSourceEnum.getValue());
    }

    /**
     * 取得当前数据源
     * @return
     */
    public static String getDbType() {
        return contextHolder.get();
    }

    /**
     * 清除上下文数据
     */
    public static void clearDbType() {
        contextHolder.remove();
    }
}
