package com.revature.ms.order.service;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.revature.ms.order.client.InventoryClient;
import com.revature.ms.order.dto.OrderRequest;
import com.revature.ms.order.model.Order;
import com.revature.ms.order.repository.OrderRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {
    private final OrderRepository orderRepository;
    private final InventoryClient inventoryClient;
   
    public void placeOrder(OrderRequest orderRequest) {

       var isInStock = inventoryClient.isInStock(orderRequest.skuCode(), orderRequest.quantity());
       if(isInStock) {
            Order order = new Order();
            order.setOrderNumber(UUID.randomUUID().toString());
            order.setPrice(orderRequest.price().multiply(BigDecimal.valueOf(orderRequest.quantity())));
            order.setSkuCode(orderRequest.skuCode());
            order.setQuantity(orderRequest.quantity());
            orderRepository.save(order);
       }else {
    	   throw new RuntimeException("Product with skuCode "+orderRequest.skuCode()+" is not in stock");
       }
          
           
    }
}
