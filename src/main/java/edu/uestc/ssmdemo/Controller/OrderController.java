package edu.uestc.ssmdemo.Controller;

import edu.uestc.ssmdemo.Convert.ConvertUtil;
import edu.uestc.ssmdemo.Model.OrderTableVo;
import edu.uestc.ssmdemo.Model.OrderVo;
import edu.uestc.ssmdemo.entity.Ordertable;
import edu.uestc.ssmdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

/**
 * Created by hu on 2018-04-23.
 */
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/insertorder")
    public void insertOrder(OrderTableVo orderTableVo){

        Ordertable ordertable = ConvertUtil.OrderTableVo2Ordertable(orderTableVo);
        UUID uuid = UUID.randomUUID();
        ordertable.setOrderno(uuid.toString());
        orderService.insertOrder(ordertable);

    }
    @RequestMapping(value = "/queryorder")
    public String queryOrderByCustomerNameAndDate(OrderVo orderVo,Model model){

        List<Ordertable> ordertables = orderService.queryOrderByCustomerNameAndDate(orderVo);
        model.addAttribute("ordertable",ordertables);
        return "test";
    }
    @RequestMapping(value = "bbb")
    public String test(){
        return "order/dateselect";
    }
}
