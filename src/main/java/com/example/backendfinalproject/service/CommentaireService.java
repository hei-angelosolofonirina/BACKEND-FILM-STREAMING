package com.example.backendfinalproject.service;

import com.example.backendfinalproject.model.Commentaire;
import com.example.backendfinalproject.repository.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
public class CommentaireService {
    @Autowired
    CommentaireRepository commentaireRepository;

    public List<Commentaire> getAllCommentaire(){
        return commentaireRepository.findAll();
    }
    public Optional<Commentaire> getByCommentaireId(Integer id){
        return commentaireRepository.findById(id);
    }
    public Commentaire createComs(Commentaire commentaire){
        return commentaireRepository.save(commentaire);
    }
    
    public void deleteById(Integer id) {
    commentaireRepository.deleteById(id);
    }
    @Transactional
    public List<Commentaire> createManyComs(List<Commentaire> listComs){
        return commentaireRepository.saveAll(listComs);
    }
}
