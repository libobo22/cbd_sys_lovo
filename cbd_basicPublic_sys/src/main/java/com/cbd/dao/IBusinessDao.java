package com.cbd.dao;


import com.cbd.entity.Business;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface IBusinessDao {
    /**
     * 条件查询企业用户（状态为有效）
     *
     * @param name         企业名称
     * @param floor        楼层位置
     * @param contact      联系人
     * @param contactPhone 联系电话
     * @param startIndex   起始下标
     * @param pageSize     限制条数
     * @return 企业用户集合
     */
    List<Business> getListByCondition(@Param("name") String name, @Param("floor") String floor, @Param("contact") String contact, @Param("contactPhone") String contactPhone, @Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    /**
     * 条件查询总记录数（状态为有效）
     *
     * @param name         企业名称
     * @param floor        楼层位置
     * @param contact      联系人
     * @param contactPhone 联系电话
     * @return 总记录数
     */
    int getTotalCountByCondition(@Param("name") String name, @Param("floor") String floor, @Param("contact") String contact, @Param("contactPhone") String contactPhone);

    /**
     * 按ID查询企业用户
     *
     * @param id 企业用户ID
     * @return 企业用户对象
     */
    Business getById(int id);

    /**
     * 按ID修改企业用户状态
     *
     * @param status 状态（0为无效，1为有效）
     * @param id     企业用户ID
     * @return 是否修改成功
     */
    int updateStatusById(@Param("status") int status, @Param("id") int id);

    /**
     * 添加企业用户
     *
     * @param business 企业用户对象
     * @return 是否添加成功
     */
    int saveByEntity(Business business);

    int updateBusinessById(@Param("id") int id, @Param("contact") String contact, @Param("contactPhone") String contactPhone);
}
