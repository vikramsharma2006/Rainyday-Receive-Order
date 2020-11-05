package com.rainyday.receiveorder.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rainyday.receiveorder.model.OrderRequestList;
import com.rainyday.receiveorder.model.Product;
import com.rainyday.receiveorder.repository.ReceiveOrderRepository;
import com.rainyday.receiveorder.service.ReceiveOrderService;

@Service
public class ReceiveOrderServiceImpl implements ReceiveOrderService {
    
	@Autowired
    private ReceiveOrderRepository receiveOrderRepository;
	
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
		
		
		Product productcoldCoffee=new Product();
		productcoldCoffee.setCategory("beverage");
		productcoldCoffee.setCompanyname("demo1");
		productcoldCoffee.setEstimatedprice(100);
		productcoldCoffee.setId(3l);
		productcoldCoffee.setName("coldCoffee");
		
		Product producthottea=new Product();
		producthottea.setCategory("beverage");
		producthottea.setCompanyname("demo1");
		producthottea.setEstimatedprice(100);
		producthottea.setId(4l);
		producthottea.setName("hottea");
		productList.add(productcoffee);
		productList.add(producttea);
		productList.add(productcoldCoffee);
		productList.add(producthottea);
		
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