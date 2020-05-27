package com.cbd.dao;

import com.cbd.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;



@Mapper
public interface IUserDao {

    public int  registerUser(User user);

    public User findById(int id);

    public int  updateUserById(@Param("id") int id, @Param("homeAddress") String homeAddress, @Param("phone") String phone, @Param("job") String job, @Param("email") String email);

}
