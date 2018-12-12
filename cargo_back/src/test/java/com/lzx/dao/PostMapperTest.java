package com.lzx.dao;

import com.lzx.base.BaseSpringTest;
import com.lzx.entity.Post;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

public class PostMapperTest extends BaseSpringTest {

    @Autowired
    private PostMapper postMapper;

    @Test
    public void insert() {
        postMapper.insert(new Post("","中耳",new Date(),"车坏了，有朋友帮帮忙吗？"));
    }

    @Test
    public void selectAll() {
        postMapper.selectAll();
    }

    @Test
    public void updateCountComment(){
        postMapper.updateCountComment(4);
    }
}