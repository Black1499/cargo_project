package com.lzx.dao;

import com.lzx.entity.Admin;

import java.util.Date;
import java.util.List;

/**
 * @author lzx
 * @date 2018/12/11
 */
public interface AdminMapper {

    List<Admin> selectAtWork();

    int insert(Admin record);

    List<Admin> selectByLeftTime();

    List<Admin> selectByName(String name);


    int updateByPrimaryKey(Admin record);
}