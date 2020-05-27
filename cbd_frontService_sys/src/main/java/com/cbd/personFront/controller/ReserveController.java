package com.cbd.personFront.controller;

import com.cbd.personFront.bean.ReserveBean;
import com.cbd.personFront.service.IReserveService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "预定车位controller")
@RestController("/ReserveController")
public class ReserveController {

    @Autowired
    IReserveService reserveService;

    @ApiOperation("添加车位预定")
    @PostMapping("/addReserve")
    public String addReserve(int carLeaseId,
                             String leaveMessage,
                             int reserveStatus,
                             String ownerRealName,
                             String ownerPhone,
                             String ownerIdentityNum,
                             String reserveRealName,
                             String reservePhone,
                             String reserveIdentityNum){
        ReserveBean bean = new ReserveBean(carLeaseId,leaveMessage,reserveStatus,ownerRealName,ownerPhone,ownerIdentityNum,reserveRealName,reservePhone,reserveIdentityNum);
        reserveService.addReserve(bean);
        System.out.println(bean.toString());
        return "ok";
    }

    @ApiOperation("根据当前用户身份证号，查询预定车位集合。")
    @GetMapping("/findByReserve/{reserveIdentityNum}/{page}/{number}")
    public List<ReserveBean> findByReserve(@PathVariable String reserveIdentityNum,
                                           @PathVariable int page,
                                           @PathVariable int number){
      return   reserveService.findByReserve(reserveIdentityNum,page,number);
    }

    @ApiOperation("根据当前用户身份证号查询，被预定车位")
    @GetMapping("/findByBeReserve/{beReserveIdentityNum}/{page}/{number}")
    List<ReserveBean> findByBeReserve(@PathVariable String beReserveIdentityNum,
                                      @PathVariable int page,
                                      @PathVariable int number){
        return reserveService.findByBeReserve(beReserveIdentityNum,page,number);
    }

    @ApiOperation("根据预定ID修改预定状态")
    @PostMapping("/updateReservationState")
    public String updateState(String newState,int reserveId){
        reserveService.updateState(newState,reserveId);
        return "ok";
    }


}
