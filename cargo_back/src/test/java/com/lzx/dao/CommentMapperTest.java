package com.lzx.dao;

import com.lzx.base.BaseSpringTest;
import com.lzx.entity.Comment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

import static org.junit.Assert.*;

public class CommentMapperTest extends BaseSpringTest {

    @Autowired
    private CommentMapper mapper;

    @Test
    public void insert() {
        mapper.insert(new Comment(1,"王五","我来，马上到"));
    }

    @Test
    public void selectByPostId() {
        mapper.selectByPostId(1);
    }

    @Test
    public void updateAgreeCount() {
        mapper.updateAgreeCount(1);
    }

    @Test
    public void countCommentByPostId(){
        int num =  mapper.countCommentByPostId(1);
        System.out.println(num);
    }
}