package com.cbd.service;

import com.cbd.bean.CBDCarBean;
import com.cbd.bean.Pagination;

import java.util.List;

public interface ICBDCarService {
    public Pagination<CBDCarBean> findAll(int currentPage, int pageSize);

    public void addCar(CBDCarBean cbdCarBean);
}
