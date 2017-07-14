package com.baomidou.springmvc.platform.jdbc;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by maohua on 2017/7/13.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DbContextHolder.getDbType();
    }
}
