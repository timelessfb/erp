package edu.uestc.ssmdemo.service.impl;

import edu.uestc.ssmdemo.dao.TasktableMapper;
import edu.uestc.ssmdemo.entity.Tasktable;
import edu.uestc.ssmdemo.service.TaskTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hu on 2018-04-23.
 */
@Service
public class TaskTableServiceImpl implements TaskTableService {
    @Autowired
    TasktableMapper tasktableMapper;


    public void insertTask(Tasktable tasktable) {
        tasktableMapper.insert(tasktable);
    }


    public Tasktable queryTaskByTaskNo(String taskno) {
        Tasktable tasktable = tasktableMapper.selectByPrimaryKey(taskno);
        return tasktable;
    }
}
