package com.example.americanbistro.services;

import com.example.americanbistro.dtos.UserRequest;
import com.example.americanbistro.dtos.UserResponse;
import com.example.americanbistro.mappers.RequestToUserMapper;
import com.example.americanbistro.mappers.UserToResponseMapper;
import com.example.americanbistro.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserToResponseMapper userToResponseMapper;

    @Override
    public List<UserResponse> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userToResponseMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public void addUser(UserRequest userRequest) {
        userRepository.save(RequestToUserMapper.mapToUser(userRequest));
    }
}
