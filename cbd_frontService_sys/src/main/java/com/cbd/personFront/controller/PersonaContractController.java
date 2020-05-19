package com.cbd.personFront.controller;

import com.cbd.personFront.bean.PersonalContractBean;
import com.cbd.personFront.service.IPersonalContractService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(tags = "个人合同Controller")
@RestController("/contact")
public class PersonaContractController {

    @Autowired
    IPersonalContractService contractService;

    @ApiOperation("根据当前用身份证号查询当前用户的合同")
    @GetMapping("/findByPersonalContract/{identityNum}/{page}/{number}")
   public List<PersonalContractBean> findByPersonalContract(@PathVariable String identityNum,
                                                            @PathVariable int page,
                                                            @PathVariable int number){
       return contractService.findByPersonalContract(identityNum,page,number);
   }

   @ApiOperation("根据合同id，查询合同详细信息")
   @GetMapping("/findByContractInfo/{contractId}")
   public PersonalContractBean findByContractInfo(@PathVariable int contractId){
        return contractService.findByContractInfo(contractId);
   }

   @ApiOperation("根据身份证号查成交历史记录")
   @GetMapping("/findByHistory")
   public List<PersonalContractBean> findByHistory(String IdentityNum,int page ,int number){
        return contractService.findByHistory(IdentityNum,page,number);
   }

   @ApiOperation(value = "根据用户类型修（卖家/买家/审核员）和 合同id修改对应的合同签约状态或审核状态")
   @PostMapping("updateStatus")
   public String updateStatus(int newContractStatus,int contractID,String userStatus ){
        contractService.updateStatus(newContractStatus,contractID,userStatus);
        return "ok";
   }

   @ApiOperation(value = "添加个人合同")
   @PostMapping("/addContract")
   public String addContract(PersonalContractBean  bean){
        contractService.addContract(bean);
        return "ok";
   }


}
