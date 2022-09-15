package com.example.backendfinalproject.controller;

import com.example.backendfinalproject.model.Film;
import com.example.backendfinalproject.repository.FilmRepository;
import com.example.backendfinalproject.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController

public class FilmController {
    @Autowired
    FilmService filmService;

    @PostMapping("/film")
    public Film creteFilm(@Validated @RequestBody Film film){
        return filmService.addAnFilm(film);
    }
    @PostMapping("/films")
    public List<Film> createManyFilm(@Validated @RequestBody List<Film> list){
        return filmService.addManyFilm(list);
    }

    @GetMapping("/films")
    private List<Film> getAll(){
        return filmService.getAllFilms();
    }

    @DeleteMapping("/films")
    private void deleteFilmById(Integer id){
        return FilmService.deleteById(id);
    }
    
    @GetMapping("/films/{id}")
    private Optional<Film> getById(@PathVariable Integer id){
        return filmService.getByFilmId(id);
    }
}

