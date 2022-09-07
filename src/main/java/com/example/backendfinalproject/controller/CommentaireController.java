package com.example.backendfinalproject.controller;

import com.example.backendfinalproject.model.Commentaire;
import com.example.backendfinalproject.service.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class CommentaireController {
    @Autowired
    CommentaireService commentaireService;
    @PostMapping("/commentaire")
    public Commentaire postComs(@RequestBody Commentaire commentaire){
        return commentaireService.createComs(commentaire);
    }
    @PostMapping("/commentaires")
    public List<Commentaire> postManyComs(@Validated @RequestBody List<Commentaire> listComs){
        return commentaireService.createManyComs(listComs);
    }

    @GetMapping("/commentaire")
    public List<Commentaire> getAllComs(){
        return commentaireService.getAllCommentaire();
    }
    @GetMapping("/commentaire/{id}")
    public Optional<Commentaire> getByIdComs(@PathVariable Integer id){
        return commentaireService.getByCommentaireId(id);
    }
}
