package com.example.onlinestore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
    @Id
    private int productid;
    private String productname;
    private int quantity;
    private double price;
	public Product(int productid, String productname, int quantity, double price) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.quantity = quantity;
		this.price = price;
	}
	public Product() {
		super();
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
    
}

