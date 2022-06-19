package com.example.americanbistro.dtos;

import lombok.Data;

@Data
public class OrderRequest {
    private long userId;
    private String name;
}