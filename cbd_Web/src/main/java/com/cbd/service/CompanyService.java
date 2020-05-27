package com.cbd.service;
import com.cbd.Vo.CompanyVo.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 企业前端接口
 */
@FeignClient("adminService")
public interface CompanyService {

    //查看所有合同
    @RequestMapping("/findContract")
    List<ContractVo> findAllContract(@RequestParam int currPage,@RequestParam int numbers);

    //查看已租车位
    @RequestMapping("/findLease")
    List<LeaseCarVo> findLease(@RequestParam int id,@RequestParam int currPage,@RequestParam int numbers);

    //查看CBD空闲车位
    @RequestMapping("/findFree")
    List<CBDFreeCarVo> findFreeCar(@RequestParam int currPage,@RequestParam int numbers);

    //查看账单信息
    @RequestMapping("/findBill")
    public List<BillVo> findBill(@RequestParam String start,@RequestParam String end,@RequestParam int currPage,@RequestParam int numbers);

    //查看合计账单
    @RequestMapping("/findBillAll")
    List<AllBillVo> findBillAll();

    //查看企业信息
    @RequestMapping("/findMine")
    CompanyInfoVo findCompanyByID(@RequestParam int id);

    //修改企业
    @RequestMapping("/updateMine")
    int updateCompanyInfo(@RequestParam int id,@RequestParam String logName,@RequestParam String logPass,@RequestParam String linkman,@RequestParam String linkPhone);

}
