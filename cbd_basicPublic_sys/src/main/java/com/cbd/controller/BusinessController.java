package com.cbd.controller;


import com.cbd.entity.Business;
import com.cbd.service.IBusinessService;
import com.cbd.util.Pagination;
import com.cbd.util.ReturnMessage;
import com.cbd.util.ReturnMessageUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
public class BusinessController {

    @Resource
    private IBusinessService businessService;


    @GetMapping("/business/getList")
    public ReturnMessage<Pagination<Business>> getBusinessList(@RequestParam(value = "name", required = false) String name,
                                                               @RequestParam(value = "floor", required = false) String floor,
                                                               @RequestParam(value = "contact", required = false) String contact,
                                                               @RequestParam(value = "contactPhone", required = false) String contactPhone,
                                                               @RequestParam("pageNo") int pageNo,
                                                               @RequestParam("pageSize") int pageSize) {
        Pagination<Business> pagination = businessService.getByCondition(name, floor, contact, contactPhone, pageNo, pageSize);
        return ReturnMessageUtil.success(pagination);
    }

    @GetMapping("/business/get/{id}")
    public ReturnMessage<Business> getBusiness(@PathVariable("id") int id) {
        Business business = businessService.getById(id);
        return ReturnMessageUtil.success(business);
    }

    @PutMapping("/business/del/{id}")
    public ReturnMessage<?> updateStatus(@PathVariable("id") int id) {
        boolean result = businessService.updateStatusById(0, id);
        return result ? ReturnMessageUtil.success() : ReturnMessageUtil.error();
    }

    @PostMapping("/business/save")
    public ReturnMessage<?> saveBusiness(@RequestBody Business business) {
        boolean result = businessService.saveByEntity(business);
        return result ? ReturnMessageUtil.success() : ReturnMessageUtil.error();
    }



    @PutMapping("/business/updateBusinessById")
    public ReturnMessage<?> updateBusiness(@RequestParam("id") int id,
                                   @RequestParam("userName") String userName,
                                   @RequestParam("password") String password,
                                   @RequestParam("contact") String contact,
                                   @RequestParam("contactPhone") String contactPhone) {
        boolean result= businessService.updateBusinessById(id, userName, password, contact, contactPhone);
        return  result? ReturnMessageUtil.success() : ReturnMessageUtil.error();
    }
}
