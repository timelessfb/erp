package edu.uestc.ssmdemo.Controller;

import edu.uestc.ssmdemo.Convert.ConvertUtil;
import edu.uestc.ssmdemo.Model.ProcessVo;
import edu.uestc.ssmdemo.Model.TasktableVo;
import edu.uestc.ssmdemo.Tool.SerializeObjectTool;
import edu.uestc.ssmdemo.entity.Tasktable;
import edu.uestc.ssmdemo.service.TaskTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hu on 2018-04-23.
 */
@Controller
public class TaskTableController {
    @Autowired
    TaskTableService taskTableService;

    @RequestMapping(value = "/inserttask")
    public void insertTask(TasktableVo tasktableVo) throws Exception {

        Tasktable tasktable = ConvertUtil.TasktableVo2Tasktable(tasktableVo);

        taskTableService.insertTask(tasktable);
    }

    @RequestMapping(value = "/gettaskbytaskno")
    public String getTaskByTaskNo(TasktableVo tasktableVo) throws Exception {
        Tasktable tasktable = taskTableService.queryTaskByTaskNo(tasktableVo.getTaskno());

        byte[] processBytes = tasktable.getProcess();
        ProcessVo processObj = (ProcessVo)SerializeObjectTool.ReSerializeObject(processBytes);

        System.out.println(processObj);
        return "test";
    }

}
