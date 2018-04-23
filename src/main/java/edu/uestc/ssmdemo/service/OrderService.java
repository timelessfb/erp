package edu.uestc.ssmdemo.service;

import edu.uestc.ssmdemo.Model.OrderVo;
import edu.uestc.ssmdemo.entity.Ordertable;

/**
 * Created by hu on 2018-04-23.
 */
public interface OrderService {
    int insertOrder(Ordertable ordertable);
    Ordertable queryOrderByCustomerNameAndDate(OrderVo orderVo);
}
