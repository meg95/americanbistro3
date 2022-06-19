package com.example.americanbistro.controllers;

import com.example.americanbistro.dtos.UserRequest;
import com.example.americanbistro.dtos.UserResponse;
import com.example.americanbistro.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<UserResponse> getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping("/add")
    public void addNewUser(@RequestBody UserRequest userRequest) {
        userService.addUser(userRequest);
    }
}