package com.rainyday.receiveorder.controller;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.rainyday.receiveorder.model.Product;
import com.rainyday.receiveorder.service.ReceiveOrderService;

@Controller
public class ReceiveOrderController {
   
	@Autowired
    private ReceiveOrderService receiveOrderService;
	
	 private static final Logger logger = LoggerFactory.getLogger(ReceiveOrderController.class);
	 
    @GetMapping("/products")
    public List<Product> registration(BindingResult bindingResult) {
        
    	logger.info(String.format("get all product in the system"));
    	List<Product>productList=receiveOrderService.getAllProduct();
        if (bindingResult.hasErrors() && productList.size()<1) {
            return productList;
        }
        return productList;
    }

}
