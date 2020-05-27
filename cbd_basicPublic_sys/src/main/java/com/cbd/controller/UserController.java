package com.cbd.controller;


import com.cbd.entity.User;
import com.cbd.service.IUserService;
import com.cbd.util.ReturnMessage;
import com.cbd.util.ReturnMessageUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private IUserService userService;

    @PostMapping("/user/registerUser")
    public ReturnMessage<?> saveUser(@RequestBody User user) {
        boolean result = userService.registerUser(user);
        return result ? ReturnMessageUtil.success() : ReturnMessageUtil.error();
    }

    @GetMapping("/user/findById/{id}")
    public ReturnMessage<User> getUser(@PathVariable("id") int id) {
        User user = userService.findById(id);
        return ReturnMessageUtil.success(user);
    }

    @PutMapping("/user/updateUserById")
    public ReturnMessage<?> updateUser(@RequestParam("id") int id,
                                       @RequestParam("password") String password,
                                       @RequestParam("homeAddress") String homeAddress,
                                       @RequestParam("phone") String phone,
                                       @RequestParam("job") String job,
                                       @RequestParam("email") String email) {
        boolean result = userService.updateUserById(id, password, homeAddress, phone, job, email);
        return result ? ReturnMessageUtil.success() : ReturnMessageUtil.error();

    }
}
