package com.cbd.personFront.service.impl;

import com.cbd.personFront.bean.CarLeaseBean;
import com.cbd.personFront.dao.ICarLeaseDao;
import com.cbd.personFront.service.ICarLeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 车位租凭业务接口实现类
 */
@Service(value = "carLeaseService")
public class CarLeaseServiceImpl implements ICarLeaseService {

    @Autowired
    ICarLeaseDao carLeaseDao;

    @Override
    public List<CarLeaseBean> findByDateLease(String leaseStartDate, String leaseEndDate, int page, int number) {
        int index = (page-1)*number;
        return carLeaseDao.findByDateLease(leaseStartDate,leaseEndDate,1,1,index,number);
    }

    @Override
    public List<CarLeaseBean> findByBuyCar(String carAddress, String carNumber, int page, int number) {
        int index = (page-1)*number;
        return carLeaseDao.findByBuyCar(carAddress,carNumber,1,2,index,number);
    }

    @Override
    public void addLeaseCar(CarLeaseBean carLeaseBean) {
        carLeaseDao.addLeaseCar(carLeaseBean);
    }
}
