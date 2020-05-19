package com.cbd.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 企业前端接口
 */
@FeignClient("frontService")
public interface ICompanyService {

    //进入企业主页面页面
    @RequestMapping("/main")
    String main();

    //查看所有合同
    @RequestMapping("/findContract")
    String findAllContract();

}
