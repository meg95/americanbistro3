package com.example.americanbistro.mappers;

import com.example.americanbistro.data.Oorder;
import com.example.americanbistro.data.Uuser;
import com.example.americanbistro.dtos.UserRequest;
import com.example.americanbistro.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RequestToUserMapper {

    private final OrderService orderService;

    public static Uuser mapToUser(UserRequest request){
        Uuser user = new Uuser();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setOrder(new Oorder(request.getOrderId(),null, null));
        return user;
    }
}
