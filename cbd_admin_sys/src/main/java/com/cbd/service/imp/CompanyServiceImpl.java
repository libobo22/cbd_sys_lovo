package com.cbd.service.imp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cbd.bean.CBDCarBean;
import com.cbd.bean.CompanyBean;
import com.cbd.bean.Pagination;
import com.cbd.dao.mapper.CompanyMapper;
import com.cbd.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements ICompanyService {

    @Autowired
    private CompanyMapper mapper;

    @Override
    public Pagination<CompanyBean> findAll(int currentPage, int pageSize) {
//        QueryWrapper<CompanyBean> wrapper = new QueryWrapper<>();
//        wrapper.notLike("cbdCarStatus",0);
//        Page<CompanyBean> page = new Page<>(currentPage, pageSize);
//        IPage<CompanyBean> company = mapper.selectPage(page, null);
//        List<CompanyBean> list = company.getRecords();
        QueryWrapper<CompanyBean> wrapper = new QueryWrapper<>();
        Page<CompanyBean> page = new Page<>(currentPage, pageSize);
        IPage<CompanyBean> com = mapper.selectPage(page, wrapper);
        List<CompanyBean> list = com.getRecords();

        int totalCount = mapper.selectCount(wrapper);
        Pagination<CompanyBean> c = new Pagination<>();
        c.setData(list);
        c.setTotalCount(totalCount);

        return c;
    }

    @Override
    public CompanyBean findById(int id) {

        return mapper.selectById(id);
    }

    @Override
    public void del(int id) {
        mapper.deleteById(id);
    }

    @Override
    public void add(CompanyBean companyBean) {
        mapper.insert(companyBean);
    }
}
