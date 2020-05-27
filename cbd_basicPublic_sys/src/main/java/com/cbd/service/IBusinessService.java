package com.cbd.service;

import com.cbd.entity.Business;
import com.cbd.util.Pagination;

public interface IBusinessService {
    /**
     * 分页条件查询企业用户
     *
     * @param name         企业名称
     * @param floor        楼层位置
     * @param contact      联系人
     * @param contactPhone 联系电话
     * @param pageNo       当前页
     * @param pageSize     每页显示条数
     * @return 分页对象
     */
    Pagination<Business> getByCondition(String name, String floor, String contact, String contactPhone, int pageNo, int pageSize);

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
    boolean updateStatusById(int status, int id);

    /**
     * 添加企业用户
     *
     * @param business 企业用户对象
     * @return 是否添加成功
     */
    boolean saveByEntity(Business business);


    public boolean updateBusinessById(int id, String userName, String password, String contact, String contactPhone);
}
