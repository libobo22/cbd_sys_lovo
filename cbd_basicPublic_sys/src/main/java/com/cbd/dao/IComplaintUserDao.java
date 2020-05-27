package com.cbd.dao;


import com.cbd.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface IComplaintUserDao {

    User getByUserId(int userId);

    int updateCredit(@Param("user") int userId, @Param("credit") int credit);
    
}
