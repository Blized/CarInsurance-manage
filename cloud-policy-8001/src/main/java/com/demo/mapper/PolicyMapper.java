package com.demo.mapper;

import com.demo.pojo.Warranty_info;
import org.apache.ibatis.annotations.Delete;

import java.util.List;

/**
 * @author wyq3142384480
 */
public interface PolicyMapper {
    /**
     * 查询全部保单信息
     * @return 保单信息列表
     */
    List<Warranty_info> selectWarrantyAll();

    /**
     * 新增保单信息
     * @param warrantyInfo 新增保单对象
     * @return 添加结果
     */
    int insertWarranty(Warranty_info warrantyInfo);

    /**
     * 删除保单信息
     * @param wNo 删除的保单Id
     * @return 删除结果
     */
    int deleteWarranty(String wNo);

    /**
     * 修改保单信息
     * @param warrantyInfo 修改的保单对象
     * @return 修改结果
     */
    int updateWarranty(Warranty_info warrantyInfo);






}
