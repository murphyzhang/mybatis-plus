package com.baomidou.springmvc.model.system;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * 系统用户表
 */
@TableName("order")
public class Order implements Serializable {

    private Integer id;
    private String orderNum;
    private Integer orderType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }
}
