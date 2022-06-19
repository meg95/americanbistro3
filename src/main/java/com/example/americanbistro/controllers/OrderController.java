package com.example.americanbistro.controllers;

import com.example.americanbistro.dtos.OrderRequest;
import com.example.americanbistro.dtos.OrderResponse;
import com.example.americanbistro.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    @GetMapping
    public List<OrderResponse> getAllOrders(){
        return orderService.getAllOrders();
    }
    @PostMapping("/add")
    public void addNewOrder(@RequestBody OrderRequest orderRequest) {
        orderService.addOrder(orderRequest);
    }
}