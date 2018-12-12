package com.lzx.dao;

import com.lzx.base.BaseSpringTest;
import com.lzx.entity.Log;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class LogMapperTest extends BaseSpringTest {

    @Autowired
    private LogMapper logMapper;

    @Test
    public void insert() {
        logMapper.insert(new Log(1,"登录成功"));
    }

    @Test
    public void selectAll() {
        logMapper.selectAll();
    }

    @Test
    public void selectByAdmin() {
        logMapper.selectByAdmin("张");
    }
}