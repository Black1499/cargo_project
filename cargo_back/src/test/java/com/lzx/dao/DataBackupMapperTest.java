package com.lzx.dao;

import com.lzx.base.BaseSpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class DataBackupMapperTest extends BaseSpringTest {

    @Autowired
    private DataBackupMapper dataBackupMapper;


    @Test
    public void insert() {
        dataBackupMapper.insert("29123dfa1.sql");
    }

    @Test
    public void selectAll() {
        dataBackupMapper.selectAll();
    }

    @Test
    public void deleteByPrimaryKey() {
        dataBackupMapper.deleteByPrimaryKey(1);
    }
}