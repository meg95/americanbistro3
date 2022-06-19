package com.example.americanbistro.repositories;

import com.example.americanbistro.data.Oorder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Oorder, Long> {
}