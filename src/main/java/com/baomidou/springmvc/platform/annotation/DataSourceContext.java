package com.baomidou.springmvc.platform.annotation;

import com.baomidou.springmvc.platform.constant.DBSourceEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by maohua on 2017/7/21.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSourceContext {
    DBSourceEnum value() default DBSourceEnum.SOURCE_MYBATIS;
}
