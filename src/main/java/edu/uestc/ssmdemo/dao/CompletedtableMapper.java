package edu.uestc.ssmdemo.dao;

import edu.uestc.ssmdemo.entity.Completedtable;
import edu.uestc.ssmdemo.entity.CompletedtableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompletedtableMapper {
    long countByExample(CompletedtableExample example);

    int deleteByExample(CompletedtableExample example);

    int deleteByPrimaryKey(Integer taskno);

    int insert(Completedtable record);

    int insertSelective(Completedtable record);

    List<Completedtable> selectByExample(CompletedtableExample example);

    Completedtable selectByPrimaryKey(Integer taskno);

    int updateByExampleSelective(@Param("record") Completedtable record, @Param("example") CompletedtableExample example);

    int updateByExample(@Param("record") Completedtable record, @Param("example") CompletedtableExample example);

    int updateByPrimaryKeySelective(Completedtable record);

    int updateByPrimaryKey(Completedtable record);
}