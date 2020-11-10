package com.rainyday.receiveorder.model;

import lombok.Data;

import java.util.List;

@Data
public class OrderRequestList {
    
	
	List<OrderRequest> orderRequest;
	
	private Long orderId;
    
}
