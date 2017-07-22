package com.baomidou.springmvc.service.system.impl;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.springmvc.platform.annotation.DataSourceContext;
import com.baomidou.springmvc.platform.constant.DBSourceEnum;

/**
 * Created by maohua on 2017/7/21.
 */
@DataSourceContext(DBSourceEnum.SOURCE_MYBATIS)
public class BaseMybatisServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T>  {

}
