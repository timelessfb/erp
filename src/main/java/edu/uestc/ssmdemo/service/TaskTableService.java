package edu.uestc.ssmdemo.service;

import edu.uestc.ssmdemo.entity.Tasktable;

/**
 * Created by hu on 2018-04-23.
 */
public interface TaskTableService {
    void insertTask(Tasktable tasktable);
    Tasktable queryTaskByTaskNo(String taskno);
}
