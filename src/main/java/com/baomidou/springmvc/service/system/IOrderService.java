package com.baomidou.springmvc.service.system;

import com.baomidou.mybatisplus.service.IService;
import com.baomidou.springmvc.model.system.Order;

import java.util.List;

/**
 *
 * Order 表数据服务层接口
 * 定义接口, 是为了不直接调用impl类
 */
public interface IOrderService extends IService<Order> {

    public List<Order> getOrderList();
}