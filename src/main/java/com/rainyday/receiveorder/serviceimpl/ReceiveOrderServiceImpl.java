package com.rainyday.receiveorder.serviceimpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

import com.rainyday.receiveorder.model.OrderRequestList;
import com.rainyday.receiveorder.service.ReceiveOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.rainyday.receiveorder.model.Product;
/*import com.rainyday.receiveorder.repository.ReceiveOrderRepository;*/

@Service
public class ReceiveOrderServiceImpl implements ReceiveOrderService {
    
/*	@Autowired
    private ReceiveOrderRepository receiveOrderRepository;*/
	
	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product findByProduct(String product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> productList=new ArrayList<>();
		Product productcoffee=new Product();
		productcoffee.setCategory("beverage");
		productcoffee.setCompanyname("demo1");
		productcoffee.setEstimatedprice(100);
		productcoffee.setId(1l);
		productcoffee.setName("coffee");
		
		Product producttea=new Product();
		producttea.setCategory("beverage");
		producttea.setCompanyname("demo1");
		producttea.setEstimatedprice(100);
		producttea.setId(2l);
		producttea.setName("tea");
		productList.add(productcoffee);
		productList.add(producttea);
		
		return productList;
	}

	@Override
	public List<Product> order(OrderRequestList orderRequestList) {
		List<Product> orderedProductList = new ArrayList<>();
		orderRequestList.getOrderRequest().forEach(orderRequest -> {
			getAllProduct().stream().forEach(product -> {
				if (orderRequest.getProductId().equals(product.getId())) {
					orderedProductList.add(product);
				}
			});

		});
		return orderedProductList;
	}

}