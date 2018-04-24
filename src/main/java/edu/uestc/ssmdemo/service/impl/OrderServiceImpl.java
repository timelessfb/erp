package edu.uestc.ssmdemo.service.impl;

import edu.uestc.ssmdemo.Model.OrderVo;
import edu.uestc.ssmdemo.dao.OrdertableMapper;
import edu.uestc.ssmdemo.entity.Ordertable;
import edu.uestc.ssmdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hu on 2018-04-23.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrdertableMapper ordertableMapper;

    @Override
    public int insertOrder(Ordertable ordertable) {
        int insertId = ordertableMapper.insert(ordertable);
        return insertId;
    }

    @Override
    public List<Ordertable> queryOrderByCustomerNameAndDate(OrderVo orderVo) {
        List<Ordertable> ordertables = ordertableMapper.queryOrderByCustomerNameAndDate(orderVo);
        return ordertables;
    }
}
