package edu.uestc.ssmdemo.Convert;

import edu.uestc.ssmdemo.Model.OrderTableVo;
import edu.uestc.ssmdemo.entity.Ordertable;
import org.apache.log4j.Logger;
import org.junit.Assert;

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
        String customer = orderTableVo.getCustomer();
        String weight = orderTableVo.getWeight();
        String remarkoftype = orderTableVo.getRemarkoftype();
        String countofcloth = orderTableVo.getCountofcloth();
        String uncompleted = orderTableVo.getUncompleted();
        String dateVo = orderTableVo.getDate();


        Assert.assertTrue("uncompletedΪ��",uncompleted !=null && uncompleted.length()!=0);
        Assert.assertTrue("dateVoΪ��",dateVo !=null && dateVo.length()!=0);
        Assert.assertTrue("countofclothΪ��",countofcloth !=null && countofcloth.length()!=0);
        Assert.assertTrue("customerΪ��",customer !=null && customer.length()!=0);
        Assert.assertTrue("weightΪ��",weight !=null && weight.length()!=0);
        Assert.assertTrue("remarkoftypeΪ��",remarkoftype !=null && remarkoftype.length()!=0);


        ordertable.setCustomer(customer);
        ordertable.setWeight(weight);
        ordertable.setRemarkoftype(remarkoftype);
        ordertable.setCountofcloth(Double.valueOf(countofcloth));
        ordertable.setUncompleted(Double.valueOf(uncompleted));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse(dateVo);
        } catch (ParseException e) {
            logger.error("OrderTableVo2Ordertable ����ת���쳣");
        }
        ordertable.setDate(date);

        return ordertable;
    }
}
