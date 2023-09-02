package com.example.onlinestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinestore.model.BillingInfo;

public interface BillingInfoRepository extends JpaRepository<BillingInfo, Integer> {
}