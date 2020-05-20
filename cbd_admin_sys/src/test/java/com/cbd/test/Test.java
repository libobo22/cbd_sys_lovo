package com.cbd.test;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cbd.bean.CBDCarBean;
import com.cbd.bean.CompanyBean;
import com.cbd.bean.ExternalContractBean;
import com.cbd.dao.mapper.CBDCarMapper;
import com.cbd.dao.mapper.ExternalContractMapper;
import com.cbd.service.ICBDCarService;
import com.cbd.service.ICompanyService;
import com.cbd.service.IExternalContractService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.text.SimpleDateFormat;
import java.util.Date;
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

    @Autowired
    private IExternalContractService exService;

    @Autowired
    private ICompanyService service;

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
//       List<CBDCarBean> cbdCarBeanList=cbdCarService.findAll(1,3);
//        System.out.println(cbdCarBeanList);
    }

    @org.junit.Test
    public void add(){
        CBDCarBean car = new CBDCarBean();
        car.setCarAddress("红瓦寺");
        car.setCarNumber("123");
//        car.setInOrOutStatus(1);
        cbdCarService.addCar(car);
    }

    @org.junit.Test
    public void testPageE(){  //外部合约
//        IPage<ExternalContractBean> External = new Page<>(1, 3);//参数一是当前页，参数二是每页个数
//        externalContractMapper.selectPage(External,null);
//        List<ExternalContractBean> list = External.getRecords();
//        for(ExternalContractBean ex : list){
//            System.out.println(ex);
//        }
        List<ExternalContractBean> find = exService.findAll(1,3);
        for (ExternalContractBean ex: find) {
            System.out.println(ex);
        }
    }

    @org.junit.Test
    public void addEx(){
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);


        ExternalContractBean ex = new ExternalContractBean();
        ex.setContractCompany("xxx公司");
        ex.setLinkman("duang");
        ex.setLinkPhone("3211233");
        ex.setCompanyAddress("红瓦寺");
        ex.setContractStartDate(dateString);
        ex.setContractEndDate("2022-02-02 12:23:32");
        ex.setDealPrice(2343332);
        ex.setContractOfCopy("1.jpg");
        ex.setContractNumber("编号");
        ex.setContractExtensionNumber("续约编号");
        externalContractMapper.insert(ex);
    }

    @org.junit.Test
    public void updateEX(){
//        ExternalContractBean ex  = new ExternalContractBean();
//        ex.setExternalContractID(1);
//        ex.setContractExtensionNumber("编号");
//        externalContractMapper.updateById(ex);
//        exService.updatecontractExtensionNumber(1,"续约成功");
    }

    @org.junit.Test
    public void selectBy(){
//        List<CompanyBean> findAll= service.findAll(1,5);
//        for (CompanyBean companyBean: findAll) {
//            System.out.println(companyBean);
//        }

//        CompanyBean com = service.findById(3);
//        System.out.println(com);

//        service.del(10);
        CompanyBean companyBean = new CompanyBean();
        companyBean.setCompanyName("xxx有限公司");
        companyBean.setFloor(2);
        companyBean.setLinkman("法外");
        companyBean.setLinkPhone("2333");
        companyBean.setLoginName("XXX");
        companyBean.setLoginPwd("222");
        service.add(companyBean);
    }

}
