package com.cbd.service;

import com.cbd.bean.CompanyBean;
import com.cbd.bean.Pagination;

import java.util.List;

public interface ICompanyService {

    /**
     * 分页查询企业信息
     * @param currentPage
     * @param pageSize
     * @return
     */
    public Pagination<CompanyBean> findAll(int currentPage, int pageSize);

    /**
     * 通过Id查询当前企业的详细信息
     * @param id
     * @return
     */
    public CompanyBean findById(int id);

    /**
     * 通过Id删除企业
     * @param id
     */
    public void del(int id);

    /**
     * 添加新企业
     * @param companyBean
     */
    public void add(CompanyBean companyBean);
}
