package com.lzx.dao;

import com.lzx.entity.Log;

import java.util.List;

/**
 * @author lzx
 * @date 2018/12/11
 */
public interface LogMapper {

    int insert(Log record);

    List<Log> selectAll();

    List<Log> selectByAdmin(String adminName);
}