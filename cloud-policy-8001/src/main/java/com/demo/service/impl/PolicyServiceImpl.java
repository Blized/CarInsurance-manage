package com.demo.service.impl;

import com.demo.mapper.PolicyMapper;
import com.demo.pojo.Warranty_info;
import com.demo.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wyq3142384480
 */
@Service
public class PolicyServiceImpl implements PolicyService {
    @Autowired
    PolicyMapper policyMapper;

    @Override
    public List<Warranty_info> getWarrantyAll() {
        return policyMapper.selectWarrantyAll();
    }

    @Override
    public int addWarranty(Warranty_info warrantyInfo) {
        return policyMapper.insertWarranty(warrantyInfo);
    }

    @Override
    public int deleteWarranty(String wNo) {
        return policyMapper.deleteWarranty(wNo);
    }

    @Override
    public int updateWarranty(Warranty_info warrantyInfo) {
        return policyMapper.updateWarranty(warrantyInfo);
    }

}
