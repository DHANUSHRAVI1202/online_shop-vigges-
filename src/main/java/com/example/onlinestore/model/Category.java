package com.example.onlinestore.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Category")
public class Category {
	@Id
    private int categoryid;
	private String categoryname;
	
	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name="categoryid")
	private List<Product> p;

	public Category(int categoryid, String categoryname, List<Product> p) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.p = p;
	}

	public Category() {
		super();
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public List<Product> getP() {
		return p;
	}

	public void setP(List<Product> p) {
		this.p = p;
	}
	
    
}

