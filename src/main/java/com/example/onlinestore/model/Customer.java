package com.example.onlinestore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_Table")
public class Customer {
    @Id
    private int customerid;
    private String phoneNumber;
    private String email;
    private String address;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerid, String phoneNumber, String email, String address) {
		super();
		this.customerid = customerid;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
    
    
	
    
}
