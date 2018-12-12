package com.lzx.dao;

import com.lzx.entity.Post;
import java.util.List;
/**
 * @author lzx
 * @date 2018/12/12
 */
public interface PostMapper {

    int insert(Post record);


    List<Post> selectAll();

    int updateCountComment(int postId);
}