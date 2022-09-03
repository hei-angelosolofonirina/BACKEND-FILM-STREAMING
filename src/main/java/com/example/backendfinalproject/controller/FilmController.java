package com.example.backendfinalproject.controller;

import com.example.backendfinalproject.model.Film;
import com.example.backendfinalproject.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController

public class FilmController {
    @Autowired
    FilmRepository filmRepository;

    @GetMapping("/films")
    private List<Film> getAll(){
        return filmRepository.findAll();
    }
    @GetMapping("/films/{id}")
    private Optional<Film> getById(@PathVariable Integer id){
        return filmRepository.findById(id);
    }
}

