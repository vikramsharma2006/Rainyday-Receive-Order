package com.rainyday.receiveorder.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.rainyday.receiveorder.model.Product;

public interface ReceiveOrderRepository extends JpaRepository<Product, Long> {
    //Product findByUsername(String username);
}
