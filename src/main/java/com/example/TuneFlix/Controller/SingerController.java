package com.example.TuneFlix.Controller;

import com.example.TuneFlix.Entity.Singer;
import com.example.TuneFlix.Service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/singers")
public class SingerController {

    @Autowired
    private SingerService singerService;

    @GetMapping
    public List<Singer> getSingers() {
        return singerService.getAllSingers();
    }

    @PostMapping
    public Singer createSinger(@RequestBody Singer singer) {
        return singerService.createSinger(singer);
    }

    @PutMapping("/{id}")
    public Singer updateSinger(@PathVariable Long id, @RequestBody Singer singer) {
        return singerService.updateSinger(id, singer);
    }

    @DeleteMapping("/{id}")
    public void deleteSinger(@PathVariable Long id) {
        singerService.deleteSinger(id);
    }
}

