package com.example.TuneFlix.Service;

import com.example.TuneFlix.Entity.Singer;
import com.example.TuneFlix.Repository.SingerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingerService {

    @Autowired
    private SingerRepository singerRepository;

    public List<Singer> getAllSingers() {
        return singerRepository.findAll();
    }

    public Singer createSinger(Singer singer) {
        return singerRepository.save(singer);
    }

    public Singer updateSinger(Long id, Singer singer) {
        Singer existingSinger = singerRepository.findById(id).orElseThrow(() -> new RuntimeException("Singer not found"));
        existingSinger.setName(singer.getName());
        existingSinger.setGenre(singer.getGenre());
        existingSinger.setBio(singer.getBio());
        return singerRepository.save(existingSinger);
    }

    public void deleteSinger(Long id) {
        singerRepository.deleteById(id);
    }
}

