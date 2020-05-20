package com.cbd.service.imp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cbd.bean.CBDCarBean;
import com.cbd.bean.ExternalContractBean;
import com.cbd.bean.Pagination;
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
    public Pagination<CBDCarBean> findAll(int currentPage, int pageSize) {

        QueryWrapper<CBDCarBean> wrapper = new QueryWrapper<>();
        wrapper.notLike("cbdCarStatus",0);
        Page<CBDCarBean> page = new Page<>(currentPage, pageSize);
        IPage<CBDCarBean> cbd = mapper.selectPage(page, wrapper);


        List<CBDCarBean> list = cbd.getRecords();

        int totalCount = mapper.selectCount(wrapper);
        Pagination<CBDCarBean> c = new Pagination<>();
        c.setData(list);
        c.setTotalCount(totalCount);

        return c;

    }

    @Override
    public void addCar(CBDCarBean cbdCarBean) {
       mapper.insert(cbdCarBean);
    }


}
