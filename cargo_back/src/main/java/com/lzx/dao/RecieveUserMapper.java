package com.lzx.dao;

import com.lzx.entity.RecieveUser;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author lzx
 * @date 2018/12/16
 */
public interface RecieveUserMapper {

    int insert(RecieveUser record);

    RecieveUser selectByPhoneAndPassword(RecieveUser record);

    List<RecieveUser> selectAll();

    int updatePasswordByRecieveUser(RecieveUser record);

    int updateInfoByRecieveUser(RecieveUser record);

    int updateStateByRecieveUser(@Param("rec_number") String recNumber, @Param("rec_state") String recState);

    int updatePhotoByRecieveUser(@Param("rec_number") String recNumber, @Param("rec_photo") String recPhoto);

    int updateCompletionNumberByRecieveUser(String recNumber);

    Integer selectByCreated(String date);
}