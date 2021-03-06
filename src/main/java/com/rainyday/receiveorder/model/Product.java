package com.rainyday.receiveorder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    public String name;
    public String companyName;
    public int estimatedPrice; 
    public String category;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getEstimatedPrice() {
		return estimatedPrice;
	}
	public void setEstimatedPrice(int estimatedPrice) {
		this.estimatedPrice = estimatedPrice;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", companyName=" + companyName + ", estimatedPrice="
				+ estimatedPrice + ", category=" + category + "]";
	}
	
}

