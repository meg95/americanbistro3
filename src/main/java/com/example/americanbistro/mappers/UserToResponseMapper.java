package com.example.americanbistro.mappers;

import com.example.americanbistro.data.Uuser;
import com.example.americanbistro.dtos.UserResponse;
import org.springframework.stereotype.Component;

@Component
public class UserToResponseMapper {
    public UserResponse toResponse(Uuser user){
        return new UserResponse(
                user.getId(),
                user.getEmail(),
                user.getPassword()
        );
    }
}
