package com.baomidou.springmvc.controller;

import com.baomidou.springmvc.platform.constant.DBSourceEnum;
import com.baomidou.springmvc.platform.jdbc.DbContextHolder;
import com.baomidou.springmvc.service.system.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author: D.Yang
 * Email: koyangslash@gmail.com
 * Date: 16/10/9
 * Time: 上午11:58
 * Describe: 用户控制器
 * 
 * 代码生成器，参考源码测试用例：
 * 
 * /mybatis-plus/src/test/java/com/baomidou/mybatisplus/test/generator/MysqlGenerator.java
 *
 */
@Controller
public class OrderController extends BaseController {

    private IOrderService orderService;

    @Autowired
    public void setOrderService(IOrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping("/order/index")
    public ModelAndView indexV2(ModelAndView modelAndView) {
        modelAndView.setViewName("order_index");
        DbContextHolder.setDbType(DBSourceEnum.SOURCE_ORDER);

        orderService.insertBid();

        modelAndView.addObject("orderList", orderService.selectList(null));
        return modelAndView;
    }
}
