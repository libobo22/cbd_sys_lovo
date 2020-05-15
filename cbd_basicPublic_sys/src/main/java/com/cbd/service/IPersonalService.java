package com.cbd.service;

import com.cbd.bean.PersonalBean;
import org.apache.ibatis.annotations.Param;

public interface IPersonalService {
    public void add(PersonalBean personalBean);

    public PersonalBean findById(int id);

    public void update(@Param("id") int id, @Param("pwd")String pwd, @Param("address") String address, @Param("phone") String phone, @Param("job") String job, @Param("email") String email);
}
