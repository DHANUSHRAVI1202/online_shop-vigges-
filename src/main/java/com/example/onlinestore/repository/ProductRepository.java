package com.example.onlinestore.repository;

import com.example.onlinestore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Modifying
    @Transactional
    @Query("INSERT INTO Product (productid, productname, quantity, price) " +
           "VALUES (:productid, :productname, :quantity, :price)")
    void addProduct(int productid, String productname, int quantity, double price);
    
    @Modifying
    @Transactional
    @Query("UPDATE Product SET productname = :productname, quantity = :quantity, price = :price " +
           "WHERE productid = :productid")
    void updateProduct(int productid, String productname, int quantity, double price);
    
    @Modifying
    @Transactional
    @Query("DELETE FROM Product WHERE productid = :productid")
    void deleteProduct(int productid);
}
