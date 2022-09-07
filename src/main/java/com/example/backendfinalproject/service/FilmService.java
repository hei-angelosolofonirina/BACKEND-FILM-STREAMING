package com.example.backendfinalproject.service;

import com.example.backendfinalproject.model.Film;
import com.example.backendfinalproject.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class FilmService {
    @Autowired
    FilmRepository filmRepository;

    public List<Film> getAllFilms(){
        return filmRepository.findAll();
    }

    public Optional<Film> getByFilmId(Integer id){
        return filmRepository.findById(id);
    }

    public Film addAnFilm(Film film){
        return filmRepository.save(film);
    }
    @Transactional
    public List<Film> addManyFilm(List<Film> list){
        return filmRepository.saveAll(list);
    }
}
