package com.example.TuneFlix.Repository;


import com.example.TuneFlix.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

