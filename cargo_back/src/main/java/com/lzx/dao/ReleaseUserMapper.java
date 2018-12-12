package com.lzx.dao;

import com.lzx.entity.ReleaseUser;
import java.util.List;

public interface ReleaseUserMapper {
    int deleteByPrimaryKey(Integer relId);

    int insert(ReleaseUser record);

    ReleaseUser selectByPrimaryKey(Integer relId);

    List<ReleaseUser> selectAll();

    int updateByPrimaryKey(ReleaseUser record);
}