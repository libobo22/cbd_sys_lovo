package com.cbd.service;

import com.cbd.Vo.CBDCarVo;
import com.cbd.utils.Pagination;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("adminService")
public interface CBDCarService {
    @GetMapping("/CBDCar/find")
    public Pagination<CBDCarVo> select(@RequestParam("current") int current,
                                        @RequestParam("pageSize") int pageSize);

    @PostMapping("/CBDCar/addCBD")
    public void addCBD(@RequestParam("address")String address,
                       @RequestParam("carNumber")String carNumber);

}
