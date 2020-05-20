package com.cbd.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cbd.bean.CBDCarBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface CBDCarMapper extends BaseMapper<CBDCarBean> {

    /**
     * 修改外部合约外键
     * @param ExternalId
     */
    public void update(int ExternalId);

}
