package com.example.backendfinalproject.service;

import com.example.backendfinalproject.model.AchatFilm;
import com.example.backendfinalproject.repository.AchatFilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class AchatFilmService {
    @Autowired
    AchatFilmRepository achatFilmRepository;

    public List<AchatFilm> readAllAchat(){
        return achatFilmRepository.findAll();
    }
    public Optional<AchatFilm> readAchatById(Long id){
        return achatFilmRepository.findById(id);
    }
    public AchatFilm createAchat(AchatFilm achatFilm){
        return achatFilmRepository.save(achatFilm);
    }
    @Transactional
    public List<AchatFilm> createManyAchat(List<AchatFilm> list){
        return achatFilmRepository.saveAll(list);
    }
}
