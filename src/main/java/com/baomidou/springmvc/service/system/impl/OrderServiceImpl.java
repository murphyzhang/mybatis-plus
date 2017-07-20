package com.baomidou.springmvc.service.system.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.springmvc.mapper.system.OrderMapper;
import com.baomidou.springmvc.model.system.Order;
import com.baomidou.springmvc.platform.constant.DBSourceEnum;
import com.baomidou.springmvc.platform.jdbc.DbContextHolder;
import com.baomidou.springmvc.service.system.IOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * order 表数据服务层接口实现类
 *
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

    @Override
    public List<Order> getOrderList() {
        DbContextHolder.setDbType(DBSourceEnum.SOURCE_ORDER);
        return selectList(null);
    }

    @Override
    public void insertBid() {
        DbContextHolder.setDbType(DBSourceEnum.SOURCE_ORDER);
        baseMapper.insertBid();
    }
}