package com.example.americanbistro.mappers;

import com.example.americanbistro.data.Oorder;
import com.example.americanbistro.data.Uuser;
import com.example.americanbistro.dtos.OrderRequest;
import com.example.americanbistro.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RequestToOrderMapper {

    private final UserService userService;

    public Oorder mapToOrder(OrderRequest request){
        Oorder order = new Oorder();
        order.setName(request.getName());
        order.setUser(new Uuser(request.getUserId(), null, null, null));
        return order;
    }
}
