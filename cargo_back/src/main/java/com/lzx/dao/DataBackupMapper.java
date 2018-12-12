package com.lzx.dao;

import com.lzx.entity.DataBackup;
import java.util.List;
/**
 * @author lzx
 * @date 2018/12/11
 */
public interface DataBackupMapper {

    int deleteByPrimaryKey(Integer dataId);

    int insert(String dataName);

    List<DataBackup> selectAll();

}