package com.cbd.service;

import com.cbd.Vo.AdminCompanyVo;
import com.cbd.utils.Pagination;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("adminService")
public interface AdminCompanyService {

    @GetMapping("/Company/findAll")
    public Pagination<AdminCompanyVo> select(@RequestParam("current") int current,
                                              @RequestParam("pageSize") int pageSize);

    @GetMapping("/Company/findById")
    public AdminCompanyVo findById(@RequestParam("id")int id);

    @RequestMapping("/Company/dele")
    public void dele(int id);

    @PostMapping("/Company/addCompany")
    public void addCompany(AdminCompanyVo companyBean);

}
