package com.example.onlinestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinestore.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}