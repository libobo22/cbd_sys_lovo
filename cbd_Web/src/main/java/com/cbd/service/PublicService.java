package com.cbd.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@FeignClient("publicService")
public interface PublicService {
    @PostMapping("register/{userName}/{password}/{realName}/{indetityNum}/{job}/{homeAddress}/{email}/{phone}")
    void addPersonal(
            @PathVariable("userName") String userName,
            @PathVariable("password") String password,
            @PathVariable("realName") String realName,
            @PathVariable("indetityNum") String indetityNum,
            @PathVariable("job") String job,
            @PathVariable("homeAddress") String homeAddress,
            @PathVariable("email") String email,
            @PathVariable("phone") String phone
    );
}
