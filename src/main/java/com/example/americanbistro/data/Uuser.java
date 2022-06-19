package com.example.americanbistro.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Uuser {
    @Id
    @GeneratedValue
    private long id;
    
    private Oorder order;
    private String email;
    private String password;
}