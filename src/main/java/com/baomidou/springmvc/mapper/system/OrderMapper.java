package com.baomidou.springmvc.mapper.system;

import com.baomidou.springmvc.common.OrderSuperMapper;
import com.baomidou.springmvc.model.system.Order;

/**
 *
 * User 表数据库控制层接口
 *
 */
public interface OrderMapper extends OrderSuperMapper<Order> {
    public void insertBid();
}
