package com.lzx.dao;

import com.lzx.entity.Comment;
import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer comId);

    int insert(Comment record);

    Comment selectByPrimaryKey(Integer comId);

    List<Comment> selectAll();

    int updateByPrimaryKey(Comment record);
}