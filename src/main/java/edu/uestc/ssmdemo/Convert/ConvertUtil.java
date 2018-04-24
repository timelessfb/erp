package edu.uestc.ssmdemo.Convert;

import edu.uestc.ssmdemo.Model.OrderTableVo;
import edu.uestc.ssmdemo.entity.Ordertable;
import org.apache.log4j.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hu on 2018-04-24.
 */
public class ConvertUtil {

    private static Logger logger = Logger.getLogger(ConvertUtil.class);

    public static Ordertable OrderTableVo2Ordertable(OrderTableVo orderTableVo) {

        Ordertable ordertable = new Ordertable();
        ordertable.setOrderno(orderTableVo.getOrderno());
        ordertable.setCustomer(orderTableVo.getCustomer());
        ordertable.setWeight(orderTableVo.getWeight());
        ordertable.setRemarkoftype(orderTableVo.getRemarkoftype());
        ordertable.setCountofcloth(Double.valueOf(orderTableVo.getCountofcloth()));
        ordertable.setUncompleted(Double.valueOf(orderTableVo.getUncompleted()));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse(orderTableVo.getDate());
        } catch (ParseException e) {
            logger.error("OrderTableVo2Ordertable 日期转换异常");
        }
        ordertable.setDate(date);

        return ordertable;
    }
}
