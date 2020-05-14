package com.cbd.personFront.service.impl;

import com.cbd.personFront.bean.BillBean;
import com.cbd.personFront.dao.IBillDao;
import com.cbd.personFront.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账单业务层实现类
 */
@Service(value = "billService")
public class BillServiceImpl implements IBillService {

    @Autowired
    IBillDao billDao;

    @Override
    public List<BillBean> findByBill(String IdentityNum, int page, int number) {
        int index=(page-1)*number;
        return billDao.findByBill(IdentityNum,index,number);
    }

    @Override
    public void addBill(BillBean billBean) {
    billDao.addBill(billBean);
    }
}
