package com.cbd.service;

import com.cbd.bean.ExternalContractBean;

import java.util.List;

public interface IExternalContractService {
    /**
     * 分页查询所有的外部合约
     * @param currentPage
     * @param pageSize
     * @return
     */
    public List<ExternalContractBean> findAll(int currentPage, int pageSize);

    /**
     * 添加合同
     * @param externalContractBean
     */
    public void add(ExternalContractBean externalContractBean);


    /**
     * 续约合同 添加一个新合同 同时把旧合同的状态改成0,以及把旧合同的续约编号改为新合同的合同编号
     * 同时修改CBD车位中外部合约的外键为0 ,并重新添加
     * @param externalContractBean
     */
    public void contract(int id,ExternalContractBean externalContractBean);

    /**
     * 通过ID查询当前合同
     * @param id
     * @return
     */
    public ExternalContractBean selectById(int id);


    /**
     * 解约
     * 通过ID修改状态为0
     * @param id
     */
    public void updateStatus(int id);

}
