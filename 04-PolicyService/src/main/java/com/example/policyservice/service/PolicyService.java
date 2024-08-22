package com.example.policyservice.service;

import com.example.policyservice.model.Policy;

import java.util.List;

public interface PolicyService {
    Policy createPolicy(Policy policy);
    Policy getPolicyById(Long id);
    List<Policy> getAllPolicies();
    List<Policy> getPoliciesByType(String type);
    Policy updatePolicy(Long id, Policy policy);
    void deletePolicy(Long id);
}