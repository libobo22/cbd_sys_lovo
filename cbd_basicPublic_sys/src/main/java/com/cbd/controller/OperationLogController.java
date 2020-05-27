package com.cbd.controller;


import com.cbd.entity.OperationLog;
import com.cbd.service.IOperationLogService;
import com.cbd.util.Pagination;
import com.cbd.util.ReturnMessage;
import com.cbd.util.ReturnMessageUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Timestamp;


@RestController
public class OperationLogController {

    @Resource
    private IOperationLogService operationLogService;

    @PostMapping("/operation/addOperationLog")
    public ReturnMessage<?> addOperationLog(@RequestBody OperationLog operationLog) {
        boolean result = operationLogService.addOperationLog(operationLog);
        return result ? ReturnMessageUtil.success() : ReturnMessageUtil.error();
    }

    @GetMapping("/operation/findOperationLogByUserLoginId")
    public ReturnMessage<Pagination<OperationLog>> findOperationLogByUserLoginId(@RequestParam("userId") int userId,
                                                                                 @RequestParam(value = "startDate", required = false) Timestamp startDate,
                                                                                 @RequestParam(value = "endDate", required = false) Timestamp endDate,
                                                                                 @RequestParam("pageNo") int PageNo,
                                                                                 @RequestParam("pageSize") int PageSize) {
        Pagination<OperationLog> operationLogs = operationLogService.findOperationLogByUserLoginId(userId,startDate, endDate,PageNo,PageSize);
        return ReturnMessageUtil.success(operationLogs);
    }

    @GetMapping("/operation/findOperationLog")
    public ReturnMessage<Pagination<OperationLog>> findOperationLog(@RequestParam(value = "startDate", required = false) Timestamp startDate,
                                                                    @RequestParam(value = "endDate", required = false) Timestamp endDate,
                                                                    @RequestParam("pageNo") int PageNo,
                                                                    @RequestParam("pageSize") int PageSize) {
        Pagination<OperationLog> operationLogs = operationLogService.findOperationLog(startDate, endDate,PageNo,PageSize);
        return ReturnMessageUtil.success(operationLogs);
    }

    @GetMapping("/operation/findRealName")
    public ReturnMessage<String> findRealName(@RequestParam("id") int id){
        String str = operationLogService.findRealName(id);
        return ReturnMessageUtil.success(str);
    }

}
