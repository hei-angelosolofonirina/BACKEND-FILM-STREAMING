package com.example.backendfinalproject.controller;

import com.example.backendfinalproject.model.Commentaire;
import com.example.backendfinalproject.repository.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CommentaireController {
    @Autowired
    CommentaireRepository commentaireRepository;

    @GetMapping("/commentaire")
    public List<Commentaire> getAllComs(){
        return commentaireRepository.findAll();
    }
    @GetMapping("/commentaire/{id}")
    public Optional<Commentaire> getComsById(@PathVariable Integer id){
        return commentaireRepository.findById(id);
    }
}
