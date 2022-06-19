package com.example.americanbistro.services;

import com.example.americanbistro.dtos.OrderRequest;
import com.example.americanbistro.dtos.OrderResponse;
import java.util.List;

public interface OrderService {
    List<OrderResponse> getAllOrders();
    void addOrder(OrderRequest orderRequest);
}