package com.example.americanbistro.services;

import com.example.americanbistro.dtos.OrderRequest;
import com.example.americanbistro.dtos.OrderResponse;
import com.example.americanbistro.mappers.OrderToResponseMapper;
import com.example.americanbistro.mappers.RequestToOrderMapper;
import com.example.americanbistro.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;
    private final OrderToResponseMapper orderToResponseMapper;
    private final RequestToOrderMapper requestToOrderMapper;

    public List<OrderResponse> getAllOrders() {
        return orderRepository.findAll().stream()
                .map(orderToResponseMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public void addOrder(OrderRequest orderRequest) {
        orderRepository.save(requestToOrderMapper.mapToOrder(orderRequest));
    }
}
