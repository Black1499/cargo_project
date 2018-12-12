package com.lzx.dao;

import com.lzx.entity.CarType;
import java.util.List;
/**
 * @author lzx
 * @date 2018/12/11
 */
public interface CarTypeMapper {

    int deleteByPrimaryKey(Integer ctypeId);

    int insert(CarType record);

    List<CarType> selectAll();

    int updateByPrimaryKey(CarType record);
}