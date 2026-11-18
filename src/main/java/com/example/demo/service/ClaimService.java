package com.example.demo.service;

import com.example.demo.dto.ClaimRequest;
import org.springframework.stereotype.Service;

@Service
public class ClaimService {

    public String submitClaim(ClaimRequest request) {

        return "Claim received successfully for policy: "
                + request.getPolicyNumber();
    }
}