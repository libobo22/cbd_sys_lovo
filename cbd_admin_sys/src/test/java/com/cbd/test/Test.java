package com.cbd.test;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cbd.bean.CBDCarBean;
import com.cbd.bean.ExternalContractBean;
import com.cbd.dao.mapper.CBDCarMapper;
import com.cbd.dao.mapper.ExternalContractMapper;
import com.cbd.service.ICBDCarService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    private CBDCarMapper mapper;

    @Autowired
    private ExternalContractMapper externalContractMapper;


    @Autowired
    private ICBDCarService cbdCarService;

    @org.junit.Test
    public void find(){
       List<CBDCarBean> cbdCarBeanList= mapper.selectList(null);
        for (CBDCarBean cbd:cbdCarBeanList) {
            System.out.println(cbd);
        }
    }


    //默认分页查询
    @org.junit.Test
    public void testPage(){
        IPage<CBDCarBean> cbdPage = new Page<>(1, 2);//参数一是当前页，参数二是每页个数
        cbdPage = mapper.selectPage(cbdPage, null);
        List<CBDCarBean> list = cbdPage.getRecords();
        for(CBDCarBean user : list){
            System.out.println(user);
        }
    }

    @org.junit.Test
    public void testCut(){
       List<CBDCarBean> cbdCarBeanList=cbdCarService.findAll(1,3);
        System.out.println(cbdCarBeanList);
    }

    @org.junit.Test
    public void add(){
        CBDCarBean car = new CBDCarBean();
        car.setCarAddress("共和村");
        car.setCarNumber("123");
        car.setInOrOutStatus(1);
        cbdCarService.addCar(car);
    }

    @org.junit.Test
    public void testPageE(){  //外部合约
        IPage<ExternalContractBean> External = new Page<>(1, 3);//参数一是当前页，参数二是每页个数
        externalContractMapper.selectPage(External,null);
        List<ExternalContractBean> list = External.getRecords();
        for(ExternalContractBean ex : list){
            System.out.println(ex);
        }
    }

}
