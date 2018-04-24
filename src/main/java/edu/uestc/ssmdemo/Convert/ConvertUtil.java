package edu.uestc.ssmdemo.Convert;

import edu.uestc.ssmdemo.Model.OrderTableVo;
import edu.uestc.ssmdemo.Model.Process;
import edu.uestc.ssmdemo.Model.ProcessVo;
import edu.uestc.ssmdemo.Model.TasktableVo;
import edu.uestc.ssmdemo.Tool.SerializeObjectTool;
import edu.uestc.ssmdemo.entity.Ordertable;
import edu.uestc.ssmdemo.entity.Tasktable;
import org.apache.log4j.Logger;
import org.junit.Assert;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hu on 2018-04-24.
 */
public class ConvertUtil {

    private static Logger logger = Logger.getLogger(ConvertUtil.class);

    public static Tasktable TasktableVo2Tasktable(TasktableVo tasktableVo) throws IOException {

        Tasktable tasktable = new Tasktable();
        tasktable.setOrderno(tasktableVo.getOrderno());
        tasktable.setTaskno(tasktableVo.getTaskno());


        ProcessVo processVo = new ProcessVo();
        for (String p : tasktableVo.getProcess()) {
            Process process = new Process();
            process.setProcess(p);
            processVo.getProcesseList().add(process);
        }

        byte[] processBytes = SerializeObjectTool.SerializeObject(processVo);
        tasktable.setProcess(processBytes);
        return  tasktable;
    }

    public static Ordertable OrderTableVo2Ordertable(OrderTableVo orderTableVo) {

        Ordertable ordertable = new Ordertable();
        String customer = orderTableVo.getCustomer();
        String weight = orderTableVo.getWeight();
        String remarkoftype = orderTableVo.getRemarkoftype();
        String countofcloth = orderTableVo.getCountofcloth();
        String uncompleted = orderTableVo.getUncompleted();
        String dateVo = orderTableVo.getDate();


        Assert.assertTrue("uncompleted为空",uncompleted !=null && uncompleted.length()!=0);
        Assert.assertTrue("dateVo为空",dateVo !=null && dateVo.length()!=0);
        Assert.assertTrue("countofcloth为空",countofcloth !=null && countofcloth.length()!=0);
        Assert.assertTrue("customer为空",customer !=null && customer.length()!=0);
        Assert.assertTrue("weight为空",weight !=null && weight.length()!=0);
        Assert.assertTrue("remarkoftype为空",remarkoftype !=null && remarkoftype.length()!=0);


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
            logger.error("OrderTableVo2Ordertable 日期转换异常");
        }
        ordertable.setDate(date);

        return ordertable;
    }
}
