
package com.example.demo.controller;

import com.example.demo.dto.ClaimRequest;
import com.example.demo.service.ClaimService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {

    private final ClaimService claimService;

    public ClaimController(ClaimService claimService) {
        this.claimService = claimService;
    }

    @PostMapping
    public String submitClaim(@Valid @RequestBody ClaimRequest request) {

        return claimService.submitClaim(request);
    }
}
