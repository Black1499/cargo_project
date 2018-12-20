package com.lzx.dao;

import com.lzx.base.BaseSpringTest;
import com.lzx.entity.RecieveUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class RecieveUserMapperTest extends BaseSpringTest {

    @Autowired
    private RecieveUserMapper recieveUserMapper;

    @Test
    public void insert() {
        recieveUserMapper.insert(new RecieveUser("王测试","123456"));
    }

    @Test
    public void selectByPhoneAndPassword() {
        recieveUserMapper.selectByPhoneAndPassword(new RecieveUser("王测试","123456"));
    }

    @Test
    public void selectAll() {
        recieveUserMapper.selectAll();
    }

    @Test
    public void updatePasswordByRecieveUser() {
        recieveUserMapper.updatePasswordByRecieveUser(new RecieveUser("王测试","111111"));
    }

    @Test
    public void updateInfoByRecieveUser() {
        recieveUserMapper.updateInfoByRecieveUser(
                new RecieveUser(1,"王测试","王测试","男",new Date(),
                        "测试地区","412827199701054012","4128271894",
                        "粤B45677","半侧",new Date(),new Date()));
    }

    @Test
    public void updateStateByRecieveUser() {
        recieveUserMapper.updateStateByRecieveUser("王测试", "离线");
    }

    @Test
    public void updatePhotoByRecieveUser() {
        recieveUserMapper.updatePhotoByRecieveUser("王测试", "pic1.img");
    }

    @Test
    public void updateCompletionNumberByRecieveUser() {
        recieveUserMapper.updateCompletionNumberByRecieveUser("王测试");
    }

    @Test
    public void selectByCreated() {
       int num = recieveUserMapper.selectByCreated("2018");
        System.out.println(num);
    }
}