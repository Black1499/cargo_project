package com.lzx.dao;

import com.lzx.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author lzx
 * @Date 2018/12/20
 */
public interface OrderMapper {

    int insert(Order record);

    Order selectByPrimaryKey(String orderId);

    List<Order> selectByState(String state);

    List<Order> selectAll();

    int countByStateOrFinished(@Param("order_state") String state, @Param("order_finished") String date);

    int sumMoneyByFinished(String date);

    BigDecimal avgMoneyByFinised(String date);

    int updateStateByPrimaryKey(Order record);

}