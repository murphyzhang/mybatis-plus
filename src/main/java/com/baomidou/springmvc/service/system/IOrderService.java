package com.baomidou.springmvc.service.system;

import com.baomidou.mybatisplus.service.IService;
import com.baomidou.springmvc.model.system.Order;
import com.baomidou.springmvc.platform.annotation.DataSourceContext;
import com.baomidou.springmvc.platform.constant.DBSourceEnum;

import java.util.List;

/**
 *
 * Order 表数据服务层接口
 * 定义接口, 是为了不直接调用impl类
 */
@DataSourceContext(DBSourceEnum.SOURCE_ORDER)
public interface IOrderService extends IService<Order> {

    public List<Order> getOrderList();

    public void insertBid();
}