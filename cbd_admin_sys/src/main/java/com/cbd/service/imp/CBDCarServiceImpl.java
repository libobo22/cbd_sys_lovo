package com.cbd.service.imp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cbd.bean.CBDCarBean;
import com.cbd.dao.mapper.CBDCarMapper;
import com.cbd.service.ICBDCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CBDCarServiceImpl implements ICBDCarService {

    @Autowired
    private CBDCarMapper mapper;

    @Override
    public List<CBDCarBean> findAll(int currentPage, int pageSize) {
        IPage<CBDCarBean> cbdPage = new Page<>(currentPage, pageSize);//参数一是当前页，参数二是每页个数
        cbdPage = mapper.selectPage(cbdPage, null);
        List<CBDCarBean> list = cbdPage.getRecords();
        return list;
    }

    @Override
    public void addCar(CBDCarBean cbdCarBean) {
       mapper.insert(cbdCarBean);
    }


}
