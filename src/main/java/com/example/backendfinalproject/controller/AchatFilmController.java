package com.example.backendfinalproject.controller;

import com.example.backendfinalproject.model.AchatFilm;
import com.example.backendfinalproject.service.AchatFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AchatFilmController {

    @Autowired
    AchatFilmService achatFilmService;

    @PostMapping("/achatfilm")
    public AchatFilm addAchatFilm(@RequestBody AchatFilm achatFilm){
        return achatFilmService.createAchat(achatFilm);
    }
    @PostMapping("/achatfilms")
    public List<AchatFilm> addManyAchatFilm(@RequestBody List<AchatFilm> list){
        return achatFilmService.createManyAchat(list);
    }

    @GetMapping("/achatfilms")
    public List<AchatFilm> getAllAchat(){
        return achatFilmService.readAllAchat();
    }

    @GetMapping("/achatfilms/{id}")
    public Optional<AchatFilm> getById(@PathVariable Long id){
        return achatFilmService.readAchatById(id);
    }

}
