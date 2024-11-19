package com.example.TuneFlix.Service;

import com.example.TuneFlix.Entity.Playlist;
import com.example.TuneFlix.Repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {

    @Autowired
    private PlaylistRepository playlistRepository;

    public List<Playlist> getAllPlaylists() {
        return playlistRepository.findAll();
    }

    public Playlist createPlaylist(Playlist playlist) {
        return playlistRepository.save(playlist);
    }

    public Playlist updatePlaylist(Long id, Playlist playlist) {
        Playlist existingPlaylist = playlistRepository.findById(id).orElseThrow(() -> new RuntimeException("Playlist not found"));
        existingPlaylist.setTitle(playlist.getTitle());
        existingPlaylist.setDescription(playlist.getDescription());
        return playlistRepository.save(existingPlaylist);
    }

    public void deletePlaylist(Long id) {
        playlistRepository.deleteById(id);
    }
}

