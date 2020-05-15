package com.cbd.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cbd.bean.CBDCarBean;
import com.cbd.bean.ExternalContractBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ExternalContractMapper extends BaseMapper<ExternalContractBean> {


}
