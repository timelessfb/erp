package edu.uestc.ssmdemo.dao;

import edu.uestc.ssmdemo.entity.Uncompletedtable;
import edu.uestc.ssmdemo.entity.UncompletedtableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UncompletedtableMapper {
    long countByExample(UncompletedtableExample example);

    int deleteByExample(UncompletedtableExample example);

    int deleteByPrimaryKey(Integer taskno);

    int insert(Uncompletedtable record);

    int insertSelective(Uncompletedtable record);

    List<Uncompletedtable> selectByExample(UncompletedtableExample example);

    Uncompletedtable selectByPrimaryKey(Integer taskno);

    int updateByExampleSelective(@Param("record") Uncompletedtable record, @Param("example") UncompletedtableExample example);

    int updateByExample(@Param("record") Uncompletedtable record, @Param("example") UncompletedtableExample example);

    int updateByPrimaryKeySelective(Uncompletedtable record);

    int updateByPrimaryKey(Uncompletedtable record);
}