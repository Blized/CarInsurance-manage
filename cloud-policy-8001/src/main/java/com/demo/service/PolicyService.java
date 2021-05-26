package com.demo.service;

import com.demo.pojo.Warranty_info;

import java.util.List;

/**
 * @author wyq3142384480
 */
public interface PolicyService {
    /**
     * 查询全部保单信息
     * @return 保单信息列表
     */
    List<Warranty_info> getWarrantyAll();

    /**
     * 新增保单信息
     * @param warrantyInfo 保单对象
     * @return 新增结果
     */
    int addWarranty(Warranty_info warrantyInfo);

    /**
     * 删除保单信息
     * @param wNo 保单编号
     * @return 删除结果
     */
    int deleteWarranty(String wNo);

    /**
     * 修改保单信息
     * @param warrantyInfo 保单对象
     * @return 修改结果
     */
    int updateWarranty(Warranty_info warrantyInfo);









}
