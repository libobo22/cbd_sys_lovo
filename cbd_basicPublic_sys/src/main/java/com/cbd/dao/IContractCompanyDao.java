package com.cbd.dao;


import com.cbd.entity.Business;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface IContractCompanyDao {

    Business getCompanyById(@Param("companyId") int companyId);

    Business getCompanyByName(@Param("companyName") String companyName);
}
