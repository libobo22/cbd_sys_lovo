package com.cbd.personFront.service.impl;

import com.cbd.personFront.bean.ReserveBean;
import com.cbd.personFront.dao.IReserveDao;
import com.cbd.personFront.service.IReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "reserveService")
public class ReserveServiceImpl implements IReserveService {


    @Autowired
    IReserveDao reserveDao;

    @Override
    public void addReserve(ReserveBean reserveBean) {
        reserveDao.addReserve(reserveBean);
    }

    @Override
    public List<ReserveBean> findByReserve(String reserveIdentityNum, int page, int number) {
        int index = (page-1)*number;
        return reserveDao.findByReserve(reserveIdentityNum,index,number);
    }

    @Override
    public List<ReserveBean> findByBeReserve(String beReserveIdentityNum, int page, int number) {
        int index = (page-1)*number;
        return reserveDao.findByBeReserve(beReserveIdentityNum,index,number);
    }

    @Override
    public void updateState(int state, int reserveId) {
        reserveDao.updateState(state,reserveId);
    }
}
