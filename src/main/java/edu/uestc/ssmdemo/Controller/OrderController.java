package edu.uestc.ssmdemo.Controller;

import edu.uestc.ssmdemo.Model.OrderVo;
import edu.uestc.ssmdemo.entity.Ordertable;
import edu.uestc.ssmdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.Calendar;

/**
 * Created by hu on 2018-04-23.
 */
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/insertorder")
    public void insertOrder(){
        Ordertable ordertable = new Ordertable();
        ordertable.setCustomer("ddf");
        ordertable.setOrderno("2");

        Date date = new Date(new java.util.Date().getTime());

        ordertable.setDate(date);
        orderService.insertOrder(ordertable);
    }
    @RequestMapping(value = "/queryorder")
    public String queryOrderByCustomerNameAndDate(Model model){
        OrderVo orderVo = new OrderVo();
        orderVo.setCustomerName("df");

        java.util.Date today = new java.util.Date();
        Calendar c = Calendar.getInstance();
        c.setTime(today);

        c.add(Calendar.DAY_OF_MONTH, 1);

        Date date = new Date(new java.util.Date().getTime());


        Ordertable ordertable = orderService.queryOrderByCustomerNameAndDate(orderVo);
        model.addAttribute("ordertable",ordertable);
        return "test";
    }
}
