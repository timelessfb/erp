package edu.uestc.ssmdemo.Controller;

import edu.uestc.ssmdemo.Model.Process;
import edu.uestc.ssmdemo.Tool.SerializeObjectTool;
import edu.uestc.ssmdemo.entity.Tasktable;
import edu.uestc.ssmdemo.service.TaskTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

/**
 * Created by hu on 2018-04-23.
 */
@Controller
public class TaskTableController {
    @Autowired
    TaskTableService taskTableService;

    @RequestMapping(value = "/inserttask")
    public void insertTask() throws IOException {
        Tasktable tasktable = new Tasktable();
        tasktable.setAberration("Aberration");
        tasktable.setTaskno("001");
        tasktable.setOrderno("111");

        Process process = new Process();
        process.setProcess("LIBU");
        process.setProcessState("LIBU");


        byte[] processBytes = SerializeObjectTool.SerializeObject(process);
        tasktable.setProcess(processBytes);

        taskTableService.insertTask(tasktable);
    }

    @RequestMapping(value = "/gettaskbytaskno")
    public String getTaskByTaskNo(Model model) throws Exception {
        Tasktable tasktable = taskTableService.queryTaskByTaskNo("001");
        byte[] processBytes = tasktable.getProcess();
        Process processObj = (Process)SerializeObjectTool.ReSerializeObject(processBytes);

        model.addAttribute("tasktable",tasktable);
        model.addAttribute("processObj",processObj);
        return "test";
    }
}
