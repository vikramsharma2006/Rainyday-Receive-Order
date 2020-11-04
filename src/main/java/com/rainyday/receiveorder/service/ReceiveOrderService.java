package com.rainyday.receiveorder.service;
import java.util.List;
import com.rainyday.receiveorder.model.Product;

public interface ReceiveOrderService {
    void save(Product product);

    Product findByProduct(String product);
    
    List<Product> getAllProduct();
}