package edu.uestc.ssmdemo.serviceimpl;

import edu.uestc.ssmdemo.dao.OrdertableMapper;
import edu.uestc.ssmdemo.entity.Ordertable;
import edu.uestc.ssmdemo.service.OrderService;
import org.apache.commons.lang.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrdertableMapper ordertableMapper;
    @Override
    public boolean add(Ordertable ordertable) {
        int orderNo = ordertableMapper.insert(ordertable);
        if(orderNo != -1){
            return true;
        }
        return false;
    }
}
