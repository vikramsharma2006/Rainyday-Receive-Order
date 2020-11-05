package com.rainyday.receiveorder.controller;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rainyday.receiveorder.model.Product;
import com.rainyday.receiveorder.service.ReceiveOrderService;

@RestController
@RequestMapping(value = "/receviceorder")
public class ReceiveOrderController {
   
	@Autowired
    private ReceiveOrderService receiveOrderService;
	
	 private static final Logger logger = LoggerFactory.getLogger(ReceiveOrderController.class);
	 
    @GetMapping("/products")
    public List<?> registration() {
        
    	logger.info(String.format("get all product in the system"));
    	List<Product>productList=receiveOrderService.getAllProduct();
    	
        if (productList.size()<1) {
            return productList;
        }
        return productList;
    }

}
