package com.lzx.dao;

import com.lzx.entity.Comment;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author lzx
 * @date 2018/12/12
 */
public interface CommentMapper {

    int insert(Comment record);

    List<Comment> selectByPostId(Integer postId);

    int updateAgreeCount(int comId);

    @MapKey("com_post_id")
    Map<Integer, Integer> countCommentByPostId(Integer postId);
}