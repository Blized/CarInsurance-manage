package com.demo.service;

import com.demo.pojo.Claim_main_info;
import com.demo.pojo.Claims;
import com.demo.pojo.Audit;
import com.demo.pojo.Warranty_info;

import java.util.List;

public interface claimsService {
    List<Claims> getClaims();

    List<Claim_main_info> getClaimMains();

    Audit getAudits(String claimMainId);

    String statusClaim(String claimMainId);

    List<Warranty_info> getWarranty(String warrantyId);

    String payMoney(String claimMainId, double payMoneys, String opinion);
}
