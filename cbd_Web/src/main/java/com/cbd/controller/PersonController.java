package com.cbd.controller;

import cn.hutool.core.date.DateTime;
import com.cbd.Vo.personVo.*;
import com.cbd.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private IPersonService personService;

    /**
     * 进入个人用户主页面
     * @return
     */
    @RequestMapping("personMain")
    public String personMain(){
        return "page/personal/personalIndex.html";
    }

    /**
     * 添加车位
     * @param personalCar
     * @return
     */
    @RequestMapping("addPersonalCar")
    @ResponseBody
    public String addPersonalCar(PersonalCarVo personalCar){
        System.out.println(personalCar);
        personService.addPersonalCar(personalCar);
        return "ok";
    }

    /**
     * 查询被预定车位
     */
    @RequestMapping("findByBeReserve/{beReserveIdentityNum}/{page}/{number}")
    @ResponseBody
    List<ReserveVo> findByBeReserve(@PathVariable String beReserveIdentityNum,
                                    @PathVariable int page,
                                    @PathVariable int number){
        System.out.println(beReserveIdentityNum+page+number);

        List<ReserveVo> reserveVos =
                personService.findByBeReserve(beReserveIdentityNum,page,number);

        List<ReserveVo> reserveVoList = new ArrayList<>();

        for (ReserveVo r:reserveVos
             ) {
            if ("3".equals(r.getReserveStatus())){
                ReserveVo reserveVo = r;
                r.setReserveStatus("待预约");
                reserveVoList.add(reserveVo);
            }else if ("1".equals(r.getReserveStatus())){
                ReserveVo reserveVo = r;
                r.setReserveStatus("已预约");
                reserveVoList.add(reserveVo);
            }else if ("2".equals(r.getReserveStatus())){
                ReserveVo reserveVo = r;
                r.setReserveStatus("已签约");
                reserveVoList.add(reserveVo);
            }else if("4".equals(r.getReserveStatus())){
                ReserveVo reserveVo = r;
                r.setReserveStatus("拒绝签约");
                reserveVoList.add(reserveVo);
            }
        }

      return reserveVoList;
    }


    /**
     * 根据预定id修改预约状态
     * @param newState
     * @param reserveId
     * @return
     */
    @RequestMapping("/updateReservationState")
    @ResponseBody
    public String updateState(String newState,int reserveId){
        personService.updateState(newState,reserveId);
        return "ok";
    }


    /**
     * 根据预定用户身份证号查询预定车位信息
     * @param reserveIdentityNum
     * @param page
     * @param number
     * @return
     */
    @RequestMapping("/findByReserve/{reserveIdentityNum}/{page}/{number}")
    @ResponseBody
    List<ReserveVo> findByReserve(@PathVariable String reserveIdentityNum,
                                  @PathVariable int page,
                                  @PathVariable int number){

        List<ReserveVo> reserveVos =
                personService.findByReserve(reserveIdentityNum,page,number);

        List<ReserveVo> reserveVoList = new ArrayList<>();

        for (ReserveVo r:reserveVos
        ) {
            if ("3".equals(r.getReserveStatus())){
                ReserveVo reserveVo = r;
                r.setReserveStatus("待预约");
                reserveVoList.add(reserveVo);
            }else if ("1".equals(r.getReserveStatus())){
                ReserveVo reserveVo = r;
                r.setReserveStatus("已预约");
                reserveVoList.add(reserveVo);
            }else if ("2".equals(r.getReserveStatus())){
                ReserveVo reserveVo = r;
                r.setReserveStatus("已签约");
                reserveVoList.add(reserveVo);
            }else if("4".equals(r.getReserveStatus())){
                ReserveVo reserveVo = r;
                r.setReserveStatus("拒绝签约");
                reserveVoList.add(reserveVo);
            }
        }
        return reserveVoList;
    }

    /**
     * 查询账单
     * @param identityNum
     * @param startDate
     * @param endDate
     * @param page
     * @param number
     * @return
     */
    @RequestMapping("/findByAllBill")
    @ResponseBody
    List<BillVo> findByBill(String identityNum,
                             String startDate,
                             String endDate,
                             int page,
                             int number){

        return personService.findByBill(identityNum,startDate,endDate,page,number);

    }

    /**
     * 查询待出售车位
     * @param carAddress
     * @param carNumber
     * @param page
     * @param number
     * @return
     */
    @PostMapping("/findByBuyCar")
    @ResponseBody
    List<CarLeaseVo> findByBuyCar(String carAddress,
                                  String carNumber,
                                  int page,
                                  int number){
        return personService.findByBuyCar(carAddress,carNumber,page,number);
    }

    /**
     * 出售车位留言
     * @return
     */
    @PostMapping("/addReserve")
    @ResponseBody
    String addReserve(int carLeaseId,
                      String leaveMessage,
                      int reserveStatus,
                       String ownerRealName,
                       String ownerPhone,
                      String ownerIdentityNum,
                      String reserveRealName,
                       String reservePhone,
                       String reserveIdentityNum){
        personService.addReserve(carLeaseId, leaveMessage, reserveStatus, ownerRealName, ownerPhone, ownerIdentityNum, reserveRealName, reservePhone, reserveIdentityNum);
        return "ok";
    }

    /**
     * 根据当前登录的用户身份证号查询该用户的所有合同
     * @param identityNum
     * @param page
     * @param number
     * @return
     */
    @PostMapping("/findByPersonalContract")
    @ResponseBody
    List<PersonalContractVo> findByPersonalContract(String identityNum,
                                                    int page,
                                                    int number){
        List<PersonalContractVo> list = personService.findByPersonalContract(identityNum,page,number);

        return list;
    }

    /**
     * 根据合同ID 查询合同详细信息
     * @param contractId
     * @return
     */
    @GetMapping("/findByContractInfo/{contractId}")
    @ResponseBody
    PersonalContractVo findByContractInfo(@PathVariable int contractId){

        return personService.findByContractInfo(contractId);
    }

    /**
     * 根据合同ID 修改合同签约状态
     * @param newContractStatus
     * @param contractID
     * @param userStatus
     * @return
     */
    @PostMapping("updateStatus")
    @ResponseBody
    String updateStatus(int newContractStatus,int contractID,String userStatus ){

        personService.updateStatus(newContractStatus,contractID,userStatus);
        return "ok";
    }

    /**
     * 查询成交历史记录
     * @param IdentityNum
     * @param page
     * @param number
     * @return
     */
    @PostMapping("/findByHistory")
    @ResponseBody
    List<PersonalContractVo> findByHistory(String IdentityNum,int page ,int number){
        return personService.findByHistory(IdentityNum,page,number);
    }

    /**
     * 添加投诉信息
     * @param carLeaseId  租凭车位id
     * @param complainInfo  投诉信息
     * @param complainRealName 投诉人真实名字
     * @param complainPhone 投诉人电话
     * @param complainIdentityNum 投诉人身份证号
     * @param beComplainRealName 被投诉人真实名字
     * @param beComplainPhone 被投诉人电话
     * @param beComplainIdentityNum 被投诉人身份证号
     * @return
     */
    @PostMapping("/addComplain")
    @ResponseBody
    String addComplain(int carLeaseId,
                       String complainInfo,
                       String complainRealName,
                       String complainPhone,
                       String complainIdentityNum,
                       String beComplainRealName,
                       String beComplainPhone,
                       String beComplainIdentityNum){

        personService.addComplain(carLeaseId,
                complainInfo,
                complainRealName,
                complainPhone,
                complainIdentityNum,
                beComplainRealName,
                beComplainPhone,
                beComplainIdentityNum);

        return "ok";
    }

    /**
     * 根据当前用户身份证查询该用户的车位
     * @param identityNum
     * @param page
     * @param number
     * @return
     */
    @PostMapping("/findByAllCar")
    @ResponseBody
    List<PersonalCarVo> findByAllCar(String identityNum,
                                     int page,
                                     int number){
        List<PersonalCarVo> list=    personService.findByAllCar(identityNum,page,number);
        return list;
    }

    /**
     * 添加出租车位
     * @param leaseEndDate
     * @param price
     * @param personalCarId
     * @param releaseIdentityNum
     * @return
     */
    @PostMapping("/addCarLease")
    @ResponseBody
    String addCarLease( String leaseEndDate,
                       float price,
                       int personalCarId,
                       String releaseIdentityNum){
        System.out.println(leaseEndDate);
        personService.addCarLease(leaseEndDate,price,1,1,personalCarId,releaseIdentityNum);
        return "ok";
    }

    /**
     * 添加出售车位
     * @param leaseEndDate
     * @param price
     * @param personalCarId
     * @param releaseIdentityNum
     * @return
     */
    @PostMapping("/addCarSell")
    @ResponseBody
    String addCarSell( String leaseEndDate,
                        float price,
                        int personalCarId,
                        String releaseIdentityNum){
        System.out.println(leaseEndDate);
        personService.addCarLease(leaseEndDate,price,1,2,personalCarId,releaseIdentityNum);
        return "ok";
    }

    /**
     * 查询待出租车位
     * @param leaseStartDate
     * @param leaseEndDate
     * @param page
     * @param number
     * @return
     */
    @PostMapping("/findByDateLease")
    @ResponseBody
    List<CarLeaseVo> findByDateLease(String leaseStartDate,String leaseEndDate,int page, int number) {

        return personService.findByDateLease(leaseStartDate,leaseEndDate,page,number);
    }

}
