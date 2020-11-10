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
	
	@Autowired
	private Producer producer;
	
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
		productcoffee.setCompanyName("Company1");
		productcoffee.setEstimatedPrice(100);
		productcoffee.setId(1l);
		productcoffee.setName("coffee");
		productList.add(productcoffee);
		
		Product producttea=new Product();
		producttea.setCategory("beverage");
		producttea.setCompanyName("Company2");
		producttea.setEstimatedPrice(100);
		producttea.setId(2l);
		producttea.setName("tea");
		productList.add(producttea);
		
		
		Product productcoldCoffee=new Product();
		productcoldCoffee.setCategory("dairy");
		productcoldCoffee.setCompanyName("Company3");
		productcoldCoffee.setEstimatedPrice(200);
		productcoldCoffee.setId(3l);
		productcoldCoffee.setName("Baking cake");
		productList.add(productcoldCoffee);
		
		Product producthottea=new Product();
		producthottea.setCategory("fruit");
		producthottea.setCompanyName("Company4");
		producthottea.setEstimatedPrice(210);
		producthottea.setId(4l);
		producthottea.setName("Fresh strawberry");
		productList.add(producthottea);
		
		Product productbread=new Product();
		productbread.setCategory("bakery");
		productbread.setCompanyName("Company5");
		productbread.setEstimatedPrice(100);
		productbread.setId(5l);
		productbread.setName("Homemade bread");
		productList.add(productbread);
		
		Product productOranges=new Product();
		productOranges.setCategory("fruit");
		productOranges.setCompanyName("Company6");
		productOranges.setEstimatedPrice(100);
		productOranges.setId(6l);
		productOranges.setName("Oranges");
		productList.add(productOranges);
		
		
		Product productHoney=new Product();
		productHoney.setCategory("bakery");
		productHoney.setCompanyName("Company7");
		productHoney.setEstimatedPrice(20);
		productHoney.setId(7l);
		productHoney.setName("Honey");
		productList.add(productHoney);
		
		Product productYogurt=new Product();
		productYogurt.setCategory("dairy");
		productYogurt.setCompanyName("Company8");
		productYogurt.setEstimatedPrice(210);
		productYogurt.setId(8l);
		productYogurt.setName("Yogurt");
		productList.add(productYogurt);
		
		
		Product productCorn=new Product();
		productCorn.setCategory("vegetable");
		productCorn.setCompanyName("Company9");
		productCorn.setEstimatedPrice(20);
		productCorn.setId(9l);
		productCorn.setName("Corn");
		productList.add(productCorn);
		
		Product productTomatoes=new Product();
		productTomatoes.setCategory("vegetable");
		productTomatoes.setCompanyName("Company10");
		productTomatoes.setEstimatedPrice(210);
		productTomatoes.setId(10l);
		productTomatoes.setName("Tomatoes");
		productList.add(productTomatoes);
		
		
		return productList;
	}

	@Override
	public List<Product> order(OrderRequestList orderRequestList) {
		String  response=producer.sendMessage(orderRequestList);
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