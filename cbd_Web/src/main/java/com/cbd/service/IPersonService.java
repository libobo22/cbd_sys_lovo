package com.cbd.service;

import com.cbd.Vo.personVo.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

/**
 * 个人用户前端service接口
 */
@FeignClient("frontService")
public interface IPersonService {

    /**
     * 添加车位
     */
    @RequestMapping("/addPersonalCar")
    String addPersonalCar(PersonalCarVo personalCar);

    /**
     * 查询被预定车位
     */
    @RequestMapping("/findByBeReserve/{beReserveIdentityNum}/{page}/{number}")
    List<ReserveVo> findByBeReserve(@PathVariable String beReserveIdentityNum,
                                    @PathVariable int page,
                                    @PathVariable int number);

    /**
     * 根据预定ID修改预定状态
     * @param newState
     * @param reserveId
     * @return
     */
    @PostMapping("/updateReservationState")
    String updateState(@RequestParam String newState,@RequestParam int reserveId);

    /**
     * 根据当前用户身份证号，查询预定车位集合（预定了别人发布的车位）
     * @param reserveIdentityNum 预定车位用户身份证
     * @param page 页码数
     * @param number 每页显示条数
     * @return
     */
    @GetMapping("/findByReserve/{reserveIdentityNum}/{page}/{number}")
    List<ReserveVo> findByReserve(@PathVariable String reserveIdentityNum,
                                  @PathVariable int page,
                                  @PathVariable int number);

    /**
     * 根据用户身份证查询账单
     * @param identityNum
     * @param page
     * @param number
     * @return
     */

     @PostMapping("/findByBill")
     List<BillVo> findByBill(@RequestParam  String identityNum,
                             @RequestParam String startDate,
                             @RequestParam String endDate,
                             @RequestParam int page,
                             @RequestParam int number);


    /**
     * 查询待出售车位
     */
    @PostMapping("/findByBuyCar")
    List<CarLeaseVo> findByBuyCar(@RequestParam String carAddress,
                                  @RequestParam String carNumber,
                                  @RequestParam int page,
                                  @RequestParam int number);

    /**
     * 出售车位留言
     * @return
     */
    @PostMapping("/addReserve")
    String addReserve(@RequestParam int carLeaseId,
                      @RequestParam  String leaveMessage,
                      @RequestParam  int reserveStatus,
                      @RequestParam  String ownerRealName,
                      @RequestParam  String ownerPhone,
                      @RequestParam  String ownerIdentityNum,
                      @RequestParam  String reserveRealName,
                      @RequestParam  String reservePhone,
                      @RequestParam  String reserveIdentityNum);

    /**
     * 根据当前用户的身份证号查询，该的所有合同
     * @param identityNum
     * @param page
     * @param number
     * @return
     */
    @PostMapping("/findByPersonalContract")
    List<PersonalContractVo> findByPersonalContract(@RequestParam String identityNum,
                                                    @RequestParam int page,
                                                    @RequestParam int number);

    /**
     * 根据合同ID 查询合同详细信息
     */
    @GetMapping("/findByContractInfo/{contractId}")
    PersonalContractVo findByContractInfo(@PathVariable int contractId);

    /**
     * 根据合同id修改合同签约状态
     * @param newContractStatus
     * @param contractID
     * @param userStatus
     * @return
     */
    @PostMapping("updateStatus")
    String updateStatus(@RequestParam int newContractStatus,
                        @RequestParam int contractID,
                        @RequestParam String userStatus );

    /**
     * 查询合同状态为审核已经通过的历史记录
     * @param IdentityNum
     * @param page
     * @param number
     * @return
     */
    @PostMapping("/findByHistory")
    List<PersonalContractVo> findByHistory(@RequestParam String IdentityNum,
                                           @RequestParam int page ,
                                           @RequestParam int number);

    /**
     * 添加投诉信息
     * @return
     */
    @PostMapping("/addComplain")
    String addComplain(@RequestParam int carLeaseId,
                       @RequestParam String complainInfo,
                       @RequestParam  String complainRealName,
                       @RequestParam  String complainPhone,
                       @RequestParam  String complainIdentityNum,
                       @RequestParam String beComplainRealName,
                       @RequestParam String beComplainPhone,
                       @RequestParam String beComplainIdentityNum);

    /**
     * 根据当前用户身份证号查询对应车位
     * @param identityNum
     * @param page
     * @param number
     * @return
     */
    @PostMapping("/findByCarAll")
    List<PersonalCarVo> findByAllCar(@RequestParam String identityNum,
                                     @RequestParam int page,
                                     @RequestParam int number);

    /**
     * 添加租凭车位
     * @param leaseEndDate
     * @param price
     * @param leaseStatus
     * @param leaseBuy
     * @param personalCarId
     * @param releaseIdentityNum
     * @return
     */
    @PostMapping("/addCarLease")
    String addCarLease(@RequestParam String leaseEndDate,
                              @RequestParam float price,
                              @RequestParam  int leaseStatus,
                              @RequestParam int leaseBuy,
                              @RequestParam int personalCarId,
                              @RequestParam String releaseIdentityNum);


    }
