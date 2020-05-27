package com.cbd.controller;


import com.cbd.entity.User;
import com.cbd.service.IComplaintUserService;
import com.cbd.util.ReturnMessage;
import com.cbd.util.ReturnMessageUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
public class ComplaintUserController {

    @Resource
    private IComplaintUserService complaintUserService;

    @GetMapping("/user/getById/{userId}")
    public ReturnMessage<User> getUserById(@PathVariable("userId") int userId) {
        User user = complaintUserService.getByUserId(userId);
        return ReturnMessageUtil.success(user);
    }

    @PutMapping("/user/updateCredit")
    public ReturnMessage<?> updateCredit(@RequestParam("user") int userId, @RequestParam("credit") int credit) {
        boolean result = complaintUserService.updateCredit(userId, credit);
        return result ? ReturnMessageUtil.success() : ReturnMessageUtil.error();
    }
}
