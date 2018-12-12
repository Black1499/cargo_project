package com.lzx.dao;

import com.lzx.entity.RecieveUser;
import java.util.List;

public interface RecieveUserMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(RecieveUser record);

    RecieveUser selectByPrimaryKey(Integer recId);

    List<RecieveUser> selectAll();

    int updateByPrimaryKey(RecieveUser record);
}