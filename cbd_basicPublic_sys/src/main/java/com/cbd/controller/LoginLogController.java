package com.cbd.controller;

import com.cbd.entity.LoginLog;
import com.cbd.entity.UserLogin;
import com.cbd.service.ILoginLogService;
import com.cbd.util.Pagination;
import com.cbd.util.ReturnMessage;
import com.cbd.util.ReturnMessageUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;


@RestController
public class LoginLogController {

    @Resource
    private ILoginLogService loginLogService;

    @PostMapping("/loginLog/addLoginLog")
    public ReturnMessage<?> addLoginLog(@RequestBody LoginLog loginLog) {
        boolean result = loginLogService.addLoginLog(loginLog);
        return result ? ReturnMessageUtil.success() : ReturnMessageUtil.error();
    }

    @GetMapping("/loginLog/findLoginLogByUserLoginId")
    public ReturnMessage<Pagination<LoginLog>> findLoginLogByUserLoginId(@RequestParam("userId") int userId,
                                                                         @RequestParam(value = "startDate", required = false) Timestamp startDate,
                                                                         @RequestParam(value = "endDate", required = false) Timestamp endDate,
                                                                         @RequestParam("pageNo") int PageNo,
                                                                         @RequestParam("pageSize") int PageSize) {
        Pagination<LoginLog> loginLogs = loginLogService.findLoginLogByUserLoginId(userId, startDate, endDate, PageNo, PageSize);
        return ReturnMessageUtil.success(loginLogs);
    }

    @GetMapping("/loginLog/findLoginLog")
    public ReturnMessage<Pagination<LoginLog>> findLoginLog(@RequestParam(value = "startDate", required = false) Timestamp startDate,
                                                            @RequestParam(value = "endDate", required = false) Timestamp endDate,
                                                            @RequestParam("pageNo") int PageNo,
                                                            @RequestParam("pageSize") int PageSize) {
        Pagination<LoginLog> loginLogs = loginLogService.findLoginLog(startDate, endDate, PageNo, PageSize);
        return ReturnMessageUtil.success(loginLogs);
    }

    @GetMapping("/loginLog/findRealName")
    public ReturnMessage<String> findRealName(@RequestParam("id") int id) {
        String str = loginLogService.findRealName(id);
        return ReturnMessageUtil.success(str);
    }

    @GetMapping("/loginLog/findIdByUserName")
    public List<UserLogin> findIdByUserName(@RequestParam(value = "userName", required = false) String userName) {
        return loginLogService.findIdByUserName(userName);
    }
}
