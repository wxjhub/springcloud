package com.vp.controller;

import com.vp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/getorder")
    public List<String> getorder(){
        return  orderService.getOrder();
    }

    @RequestMapping("/getZuulorder")
    public String getZuulorder() {
        return "order";
    }
}
