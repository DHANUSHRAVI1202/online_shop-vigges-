package com.example.onlinestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlinestore.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
