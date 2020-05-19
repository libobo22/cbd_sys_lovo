package com.cbd.service;

import com.cbd.Vo.CompanyVo.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
    List<ContractVo> findAllContract();

    //查看已租车位
    @RequestMapping("findLease")
    List<LeaseCarVo> findLease();

    //查看CBD空闲车位
    @RequestMapping("findFree")
    List<CBDFreeCarVo> findFreeCar(int currPage, int numbers);

    //查看账单信息
    @RequestMapping("findBill")
    public List<BillVo> findBill(String start, String end, int currPage, int numbers);

    //查看合计账单
    @RequestMapping("findBillAll")
    List<AllBillVo> findBillAll();

    //查看企业信息
    @RequestMapping("findMine")
    CompanyInfoVo findMine();

    //修改企业
    @RequestMapping("updateMine")
    void update(String logName,String logPass,String linkman,String linkPhone);

}
