package com.lzx.dao;

import com.lzx.base.BaseSpringTest;
import com.lzx.entity.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class OrderMapperTest extends BaseSpringTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void insert() {
        orderMapper.insert(new Order("2001",1,1,2,
                "散货，不重，速来", new BigDecimal(2900),"珠海斗门","广西北海"));
    }

    @Test
    public void selectByPrimaryKey() {
        orderMapper.selectByPrimaryKey("2001");
    }

    @Test
    public void selectByState() {
        orderMapper.selectByState("待接单");
    }

    @Test
    public void selectAll() {
        orderMapper.selectAll();
    }

    @Test
    public void countByStateOrFinished() {
        orderMapper.countByStateOrFinished("待接单", null);
    }

    @Test
    public void sumMoneyByFinished() {
        orderMapper.sumMoneyByFinished("2018");

    }

    @Test
    public void avgMoneyByFinised() {
        orderMapper.avgMoneyByFinised("2018");
    }

    @Test
    public void updateStateByPrimaryKey() {
        orderMapper.updateStateByPrimaryKey(new Order("2001","已完成"));
    }
}