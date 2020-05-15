package com.cbd.service;

import com.cbd.bean.ExternalContractBean;

import java.util.List;

public interface IExternalContractService {
    public List<ExternalContractBean> findAll(int currentPage, int pageSize);
}
