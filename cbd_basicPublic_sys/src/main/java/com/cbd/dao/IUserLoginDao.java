package com.cbd.dao;

import com.cbd.entity.UserLogin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IUserLoginDao {
    public UserLogin login(@Param("userName") String userName, @Param("password") String password);

    public int addUserLogin(UserLogin userLogin);

    public int addUserRole(@Param("userId") int userId, @Param("roleId") int roleId);

    public int updateUserLoginById(@Param("id") int id, @Param("password") String password);

    public int updateBusinessLoginById(@Param("id") int id, @Param("userName") String userName, @Param("password") String password);
}
