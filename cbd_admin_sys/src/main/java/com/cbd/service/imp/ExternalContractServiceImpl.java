package com.cbd.service.imp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cbd.bean.CBDCarBean;
import com.cbd.bean.ExternalContractBean;
import com.cbd.dao.mapper.CBDCarMapper;
import com.cbd.dao.mapper.ExternalContractMapper;
import com.cbd.service.IExternalContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ExternalContractServiceImpl implements IExternalContractService {

    @Autowired
    private ExternalContractMapper mapper;

    @Autowired
    private CBDCarMapper cbdCarMapper;

    @Override
    public List<ExternalContractBean> findAll(int currentPage, int pageSize) {

        QueryWrapper<ExternalContractBean> wrapper = new QueryWrapper<>();
        wrapper.notLike("contractStatus",0);
        Page<ExternalContractBean> page = new Page<>(currentPage, pageSize);
        IPage<ExternalContractBean> External = mapper.selectPage(page, wrapper);
        List<ExternalContractBean> list = External.getRecords();
        return list;
    }

    @Override
    public void add(ExternalContractBean externalContractBean) {
        mapper.insert(externalContractBean);
    }


    /**
     * 续约合同
     * @param externalContractBean
     */
    @Override
    public void contract(int id,ExternalContractBean externalContractBean) {
        ExternalContractBean oldEx = selectById(id);
        externalContractBean.setContractCompany(oldEx.getContractCompany());
        externalContractBean.setCompanyAddress(oldEx.getCompanyAddress());
        mapper.insert(externalContractBean);
        mapper.updateContractNumber(id,externalContractBean.getContractNumber());

        CBDCarBean car = new CBDCarBean();
        car.setCarAddress(externalContractBean.getCarAddress());
        car.setCarNumber(externalContractBean.getCarNumber());
        car.setInOrOutStatus(2);
        car.setExternalContractID(externalContractBean.getExternalContractID());
        cbdCarMapper.insert(car);


    }

    @Override
    public ExternalContractBean selectById(int id) {
        return mapper.selectById(id);
    }

    @Override
    public void updateStatus(int id) {
        mapper.updateStatus(id);
    }


}
