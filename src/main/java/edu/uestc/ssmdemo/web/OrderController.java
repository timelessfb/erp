package edu.uestc.ssmdemo.web;

import edu.uestc.ssmdemo.entity.Ordertable;
import edu.uestc.ssmdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class OrderController {
    @Autowired
    OrderService orderService;

    public String addOrder(Ordertable ordertable) {
        boolean bl = orderService.add(ordertable);
        return "/order/addResult";
    }

    @RequestMapping("/orderManager")
    public String oderIndex() {
        return "/order/orderManager";
    }
}
