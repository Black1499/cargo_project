package com.lzx.dao;

import com.lzx.entity.Country;
import java.util.List;

public interface CountryMapper {
    int deleteByPrimaryKey(Integer countryId);

    int insert(Country record);

    Country selectByPrimaryKey(Integer countryId);

    List<Country> selectAll();

    int updateByPrimaryKey(Country record);
}