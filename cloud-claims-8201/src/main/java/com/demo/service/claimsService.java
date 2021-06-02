package com.demo.service;

import com.demo.pojo.Claim_main_info;
import com.demo.pojo.Claims;
import com.demo.pojo.Audit;

import java.util.List;

public interface claimsService {
    List<Claims> getClaims();

    List<Claim_main_info> getClaimMains();

    Audit getAudits(String claimMainId);
}
