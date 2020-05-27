package com.cbd.dao;


import com.cbd.entity.Power;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IPowerDao {

public List<Power> findByRole(int roleId);

}
