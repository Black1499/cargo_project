package com.lzx.dao;

import com.lzx.entity.RecieveUser;
import com.lzx.entity.ReleaseUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @author lzx
 * @date 2018/12/17
 */
public interface ReleaseUserMapper {

    int insert(ReleaseUser record);

    ReleaseUser selectByPhoneAndPassword(ReleaseUser record);

    List<RecieveUser> selectAll();

    Integer selectByCreated(String date);

    int updatePasswordByReleaseUser(ReleaseUser record);

    int updateInfoByReleaseUser(ReleaseUser record);

    int updateStateByReleaseUser(@Param("rel_number") String relNumber, @Param("rel_state") String relState);

    int updatePhotoByReleaseUser(@Param("rel_number") String relNumber, @Param("rel_photo") String relPhoto);

    int updateCompletionNumberByReleaseUser(String relNumber);

    int updateCancelNumberByReleaseUser(String relNumber);

}