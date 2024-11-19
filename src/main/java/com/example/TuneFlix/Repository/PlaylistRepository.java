package com.example.TuneFlix.Repository;

import com.example.TuneFlix.Entity.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
