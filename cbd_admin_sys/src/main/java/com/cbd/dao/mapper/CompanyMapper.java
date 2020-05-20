package com.cbd.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cbd.bean.CompanyBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CompanyMapper extends BaseMapper<CompanyBean> {

}
