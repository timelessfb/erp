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

/**
 * Created by hu on 2018-04-24.
 */
public class ConvertUtil {

    private static Logger logger = Logger.getLogger(ConvertUtil.class);

    public static Tasktable TasktableVo2Tasktable(TasktableVo tasktableVo) throws IOException {

        Tasktable tasktable = new Tasktable();
        BeanRefUtil.TasktableVo2Tasktable(tasktableVo,tasktable);
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

        Assert.assertTrue("countofcloth为空",countofcloth !=null && !"".equals(countofcloth));
        Assert.assertTrue("customer为空",customer !=null && !"".equals(customer));
        Assert.assertTrue("weight为空",weight !=null && !"".equals(weight));
        Assert.assertTrue("remarkoftype为空",remarkoftype !=null && !"".equals(remarkoftype));

        ordertable.setCustomer(customer);
        ordertable.setWeight(weight);
        ordertable.setRemarkoftype(remarkoftype);
        ordertable.setCountofcloth(Double.valueOf(countofcloth));
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = null;
//        try {
//            date = simpleDateFormat.parse(dateVo);
//        } catch (ParseException e) {
//            logger.error("OrderTableVo2Ordertable 日期转换异常");
//        }
//        ordertable.setDate(date);

        return ordertable;
    }
}
