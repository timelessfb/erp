package edu.uestc.ssmdemo.dao;

import edu.uestc.ssmdemo.entity.Ordertable;
import edu.uestc.ssmdemo.entity.OrdertableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdertableMapper {
    long countByExample(OrdertableExample example);

    int deleteByExample(OrdertableExample example);

    int deleteByPrimaryKey(Integer orderno);

    int insert(Ordertable record);

    int insertSelective(Ordertable record);

    List<Ordertable> selectByExample(OrdertableExample example);

    Ordertable selectByPrimaryKey(Integer orderno);

    int updateByExampleSelective(@Param("record") Ordertable record, @Param("example") OrdertableExample example);

    int updateByExample(@Param("record") Ordertable record, @Param("example") OrdertableExample example);

    int updateByPrimaryKeySelective(Ordertable record);

    int updateByPrimaryKey(Ordertable record);
}