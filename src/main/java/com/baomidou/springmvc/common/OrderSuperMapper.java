package com.baomidou.springmvc.common;

import com.baomidou.springmvc.platform.annotation.DataSourceContext;
import com.baomidou.springmvc.platform.constant.DBSourceEnum;

/**
 * <p>
 * 测试自定义 mapper 父类
 * </p>
 */
@DataSourceContext(DBSourceEnum.SOURCE_ORDER)
public interface OrderSuperMapper<T> extends com.baomidou.mybatisplus.mapper.BaseMapper<T> {

    // 这里可以写自己的公共方法、注意不要让 mp 扫描到误以为是实体 Base 的操作
}
