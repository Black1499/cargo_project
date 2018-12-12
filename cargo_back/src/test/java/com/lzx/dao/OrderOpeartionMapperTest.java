package com.lzx.dao;

import com.lzx.base.BaseSpringTest;
import com.lzx.entity.Order;
import com.lzx.entity.OrderOpeartion;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class OrderOpeartionMapperTest extends BaseSpringTest {

    @Autowired
    private OrderOpeartionMapper mapper;

    @Test
    public void insert() {
        mapper.insert(new OrderOpeartion(1,"取消订单","货源不足，无法装车"));
    }

    @Test
    public void selectByPrimaryKey() {
        mapper.selectByPrimaryKey(1);
    }

    @Test
    public void selectAll() {
        mapper.selectAll();
    }

    @Test
    public void updateByPrimaryKey() {
        mapper.updateByPrimaryKey(new OrderOpeartion(1,"已完成"));
    }
}