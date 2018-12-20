package com.lzx.dao;

import com.lzx.base.BaseSpringTest;
import com.lzx.entity.ReleaseUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

public class ReleaseUserMapperTest extends BaseSpringTest {

    @Autowired
    private ReleaseUserMapper releaseUserMapper;

    @Test
    public void insert() {
        releaseUserMapper.insert(new ReleaseUser("1310000","123456"));
    }

    @Test
    public void selectByPhoneAndPassword() {
        releaseUserMapper.selectByPhoneAndPassword(new ReleaseUser("1310000","123456"));
    }

    @Test
    public void selectAll() {
        releaseUserMapper.selectAll();
    }

    @Test
    public void selectByCreated() {
        releaseUserMapper.selectByCreated("2018");
    }

    @Test
    public void updatePasswordByReleaseUser() {
        releaseUserMapper.updatePasswordByReleaseUser(new ReleaseUser("1310000","111111"));
    }

    @Test
    public void updateInfoByReleaseUser() {
        releaseUserMapper.updateInfoByReleaseUser(new ReleaseUser("1310000","年丽江","男",new Date(),
                "不知道自己住哪","41282719901013456"));
    }

    @Test
    public void updateStateByReleaseUser() {
        releaseUserMapper.updateStateByReleaseUser("1310000", "注销");
    }

    @Test
    public void updatePhotoByReleaseUser() {
        releaseUserMapper.updatePhotoByReleaseUser("1310000", "1.img");
    }

    @Test
    public void updateCompletionNumberByReleaseUser() {
        releaseUserMapper.updateCompletionNumberByReleaseUser("1310000");
    }

    @Test
    public void updateCancelNumberByReleaseUser() {
        releaseUserMapper.updateCancelNumberByReleaseUser("1310000");
    }
}