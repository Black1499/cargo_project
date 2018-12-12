package com.lzx.dao;

import com.lzx.entity.OrderOpeartion;
import java.util.List;
/**
 * @author lzx
 * @date 2018/12/11
 */
public interface OrderOpeartionMapper {

    int insert(OrderOpeartion record);

    OrderOpeartion selectByPrimaryKey(Integer opeId);

    List<OrderOpeartion> selectAll();

    int updateByPrimaryKey(OrderOpeartion record);

}