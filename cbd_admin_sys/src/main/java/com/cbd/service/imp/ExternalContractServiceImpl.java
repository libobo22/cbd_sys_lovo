package com.cbd.service.imp;

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

    @Override
    public List<ExternalContractBean> findAll(int currentPage, int pageSize) {
        IPage<ExternalContractBean> External = new Page<>(currentPage, pageSize);//参数一是当前页，参数二是每页个数
        mapper.selectPage(External,null);
        List<ExternalContractBean> list = External.getRecords();
        return list;
    }
}
