package com.cbd.personFront.service.impl;

import com.cbd.personFront.bean.PersonalContractBean;
import com.cbd.personFront.dao.IPersonalContractDao;
import com.cbd.personFront.service.IPersonalContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 个人用户合同业务实现类
 */
@Service(value = "personalContractService")
public class PersonalContractServiceImpl implements IPersonalContractService {

    @Autowired
    IPersonalContractDao contractDao;

    @Override
    public List<PersonalContractBean> findByPersonalContract(String identityNum, int page, int number) {
        int index = (page-1)*number;
        return contractDao.findByPersonalContract(identityNum,index,number);
    }

    @Override
    public PersonalContractBean findByContractInfo(int contractId) {
        return contractDao.findByContractInfo(contractId);
    }

    @Override
    public List<PersonalContractBean> findByHistory(String IdentityNum, int page, int number) {
        int index=(page-1)*number;
        return contractDao.findByHistory(IdentityNum,index,number);
    }

    /**
     * 根据合同id修合同状态
     * 用户是买家就修改买方的签约状态
     * 卖价就修改卖家的状态
     * 审核员就修改审核
     * 并且只能修改未审核的合同
     * 审核状态改为1（已审核通过）将车位状态改为 2已签约（调车位租凭的状态修改）
     * 审核状态改为1（已审核通过）将车位主人信息该为卖方的信息（调车位用户信息修改接口）
     * @param newStatus 要修改为什么状态 (2拒绝签约，1代表已签约，0代表未签约）
     *                  （2审核不通过，1代表已审核通过，0代表未审核）
     * @param userStatus 是什么用户（卖家/买家/审核员）
     * @param contractID 合同id
     */
    @Override
    public void updateStatus(int newStatus, int contractID, String userStatus) {
//        修改卖家签约状态
      if ("卖家".equals(userStatus)){
           contractDao.sellUpdateStatus(contractID,newStatus);
//          修改买家签约状态
      }else if("买家".equals(userStatus)){
            contractDao.buyUpdateStatus(contractID,newStatus);
//      修改审核状态
      }else if ("审核员".equals(userStatus)){
            contractDao.adminUpdateStatus(contractID,newStatus);
//     如果审核状态是1表示审核通过，添加合同生效时间为当前时间
          if (1==newStatus){
              SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");// 格式化时间
              Date date = new Date();// 获取当前时间
            contractDao.updateImplementDate(contractID,sdf.format(date));
          }
      }
    }

    @Override
    public void addContract(PersonalContractBean personalContractBean) {
       contractDao.addContract(personalContractBean);
    }
}
