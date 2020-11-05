package com.rainyday.receiveorder.model;

import lombok.Data;

@Data
public class OrderRequest {
    private Long productId;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
    
    
}
