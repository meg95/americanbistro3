package com.example.americanbistro.mappers;

import com.example.americanbistro.data.Oorder;
import com.example.americanbistro.dtos.OrderResponse;
import org.springframework.stereotype.Component;

@Component
public class OrderToResponseMapper {

    public OrderResponse toResponse(Oorder order){
        return new OrderResponse(
                order.getId(),
                order.getUser().getEmail()
        );
    }
}