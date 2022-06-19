package com.example.americanbistro.dtos;

import lombok.*;

@Data
public class UserRequest {
    private long orderId;
    private String email;
    private String password;
}