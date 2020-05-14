package com.cbd.personFront.service;

import com.cbd.personFront.bean.PersonalContractBean;

import java.util.List;

/**
 * 合同业务接口
 */
public interface IPersonalContractService {

    /**
     * 根据当前用身份证号查询当前用户的合同。（当前用户可以是卖方的身份证号码或是卖方的身份证号。
     * @param identityNum 当前用户身份证号
     *  @param page 页码数
     *  @param number 每页显示多少条数
     * @return
     */
    public List<PersonalContractBean> findByPersonalContract(String identityNum,int page, int number);


    /**
     * 根据合同Id查询合同详细信息
     * @param contractId
     * @return
     */
    PersonalContractBean findByContractInfo(int contractId);

    /**
     * 根据当前用户身份证号，审核状态为1（已审核）查询历史交易记录；
     * @param IdentityNum 当前用户身份证号
     * @param page 页码数
     * @param number 每页显示多少条数
     * @return
     */
    public List<PersonalContractBean> findByHistory(String IdentityNum,int page, int number);

    /**
     * 根据合同id修合同状态
     * 用户是买家就修改买方的签约状态
     * 卖价就修改卖家的状态
     * 审核员就修改审核
     * 并且只能修改未审核的合同
     * 审核状态改为1（已审核通过）将车位状态改为 2已签约（调车位租凭的状态修改）
     * 审核状态改为1（已审核通过）将车位主人信息该为卖方的信息（调车位用户信息修改接口）
     * @param auditStatus 审核状态  （2审核不通过，1代表已审核通过，0代表未审核）
     * @param newStatus 要修改为什么状态 (2拒绝签约，1代表已签约，0代表未签约）
     * @param userStatus 是什么用户（卖家/买家/审核员）
     * @param contractID 合同id
     */
    void updateStatus(int auditStatus,int newStatus,int contractID,String userStatus );

    /**
     * 添加个人用户合同
     * @param personalContractBean
     */
    void addContract(PersonalContractBean personalContractBean);


}
