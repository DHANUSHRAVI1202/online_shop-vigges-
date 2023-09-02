package com.example.onlinestore.service;

import com.example.onlinestore.model.Product;
import com.example.onlinestore.repository.ProductRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Page<Product> getAllProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
    

    @Transactional
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Transactional
    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    @Transactional
    public void deleteProduct(int productid) {
        productRepository.deleteById(productid);
    }
}
