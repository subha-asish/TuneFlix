package com.example.TuneFlix.Repository;

import com.example.TuneFlix.Entity.Singer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SingerRepository extends JpaRepository<Singer, Long> {
}

