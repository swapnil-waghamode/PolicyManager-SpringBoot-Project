package com.example.policyservice.service;

import com.example.policyservice.model.Policy;
import com.example.policyservice.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    @Override
    public Policy createPolicy(Policy policy) {
        return policyRepository.save(policy);
    }

    @Override
    public Policy getPolicyById(Long id) {
        return policyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Policy not found"));
    }

    @Override
    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }

    @Override
    public List<Policy> getPoliciesByType(String type) {
        return policyRepository.findByType(type);
    }

    @Override
    public Policy updatePolicy(Long id, Policy policy) {
        Policy existingPolicy = getPolicyById(id);
        existingPolicy.setType(policy.getType());
        existingPolicy.setCoverage(policy.getCoverage());
        existingPolicy.setPremium(policy.getPremium());
        return policyRepository.save(existingPolicy);
    }

    @Override
    public void deletePolicy(Long id) {
        Policy policy = getPolicyById(id);
        policyRepository.delete(policy);
    }
}
