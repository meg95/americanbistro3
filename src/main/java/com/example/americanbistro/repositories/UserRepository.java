package com.example.americanbistro.repositories;

import com.example.americanbistro.data.Uuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Uuser, Long> {
}