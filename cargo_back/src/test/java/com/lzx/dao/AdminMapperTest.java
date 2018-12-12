package com.lzx.dao;

import com.lzx.base.BaseSpringTest;
import com.lzx.entity.Admin;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

public class AdminMapperTest extends BaseSpringTest {

    @Autowired
    private AdminMapper mapper;

    @Test
    public void selectAtWork() {
        mapper.selectAtWork();
    }

    @Test
    public void selectByName() {
        mapper.selectByName("刘");
    }

    @Test
    public void insert() {
        mapper.insert(new Admin("13190412412", "123456", "张元", "412827199010218924", "男", new Date(), null, ""));
    }

    @Test
    public void selectByLeftTime() {
        mapper.selectByLeftTime();
    }

    @Test
    public void updateByPrimaryKey() {
        mapper.updateByPrimaryKey(new Admin(1, "13190412412", "123456", "张元", "412827199010218924", "男", new Date(), new Date(), new Date(), ""));
    }
}