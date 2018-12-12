package com.lzx.dao;

import com.lzx.entity.Country;
import java.util.List;

public interface CountryMapper {
    int deleteByPrimaryKey(Integer courtryId);

    int insert(Country record);

    Country selectByPrimaryKey(Integer courtryId);

    List<Country> selectAll();

    int updateByPrimaryKey(Country record);
}