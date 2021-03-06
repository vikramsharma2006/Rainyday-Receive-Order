package com.rainyday.receiveorder.dto;

public class ProductDto {
   
    private Long id; 
    public String name;
    public String companyname;
    public int estimatedprice; 
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
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getEstimatedprice() {
		return estimatedprice;
	}
	public void setEstimatedprice(int estimatedprice) {
		this.estimatedprice = estimatedprice;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", companyname=" + companyname + ", estimatedprice="
				+ estimatedprice + ", category=" + category + "]";
	}



}

