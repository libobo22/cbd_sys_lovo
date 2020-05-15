package com.cbd.service;

import com.cbd.bean.CBDCarBean;

import java.util.List;

public interface ICBDCarService {
    public List<CBDCarBean> findAll(int currentPage,int pageSize);

    public void addCar(CBDCarBean cbdCarBean);
}
