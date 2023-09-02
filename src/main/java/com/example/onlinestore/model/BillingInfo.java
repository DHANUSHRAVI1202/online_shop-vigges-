package com.example.onlinestore.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="BillingInfo")
public class BillingInfo {
    @Id
    private int billid;
    private String creditCardNumber;
    private String expirationDate;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="customerid")
    private Customer c;

	public BillingInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillingInfo(int billid, String creditCardNumber, String expirationDate, Customer c) {
		super();
		this.billid = billid;
		this.creditCardNumber = creditCardNumber;
		this.expirationDate = expirationDate;
		this.c = c;
	}

	public int getBillid() {
		return billid;
	}

	public void setBillid(int billid) {
		this.billid = billid;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Customer getC() {
		return c;
	}

	public void setC(Customer c) {
		this.c = c;
	}
    
	
}

