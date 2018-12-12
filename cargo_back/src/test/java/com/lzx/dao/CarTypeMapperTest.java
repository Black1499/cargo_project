package com.lzx.dao;

import com.lzx.base.BaseSpringTest;
import com.lzx.entity.CarType;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class CarTypeMapperTest extends BaseSpringTest {

    @Autowired
    private CarTypeMapper carTypeMapper;

    @Test
    public void selectAll() {
        carTypeMapper.selectAll();
    }
    @Test
    public void insert() {
        carTypeMapper.insert(new CarType(6, 47, "A2", "重型货柜牵引式货车"));
    }
    @Test
    public void updateByPrimaryKey() {
        carTypeMapper.updateByPrimaryKey(new CarType(11,6, 45, "A2", "重型货柜牵引式货车"));
    }

    @Test
    public void deleteByPrimaryKey() {
        carTypeMapper.deleteByPrimaryKey(11);
    }
}