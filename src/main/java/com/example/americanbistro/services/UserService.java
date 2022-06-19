package com.example.americanbistro.services;

import com.example.americanbistro.dtos.OrderRequest;
import com.example.americanbistro.dtos.UserRequest;
import com.example.americanbistro.dtos.UserResponse;
import java.util.List;

public interface UserService {
    List<UserResponse> getAllUsers();
    void addUser(UserRequest userRequest);
}