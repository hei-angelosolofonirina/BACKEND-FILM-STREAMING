package com.example.backendfinalproject.controller;

import com.example.backendfinalproject.model.Abonnement;
import com.example.backendfinalproject.service.AbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AbonnementController {
    @Autowired
    AbonnementService abonnementService;
    @GetMapping("/abonnements")
    public List<Abonnement> getAllAbonnement(){
        return abonnementService.getAllAbonnements();
    }
    @GetMapping("/abonnements/{id}")
    public Optional<Abonnement> getAbonById(Integer id){
        return abonnementService.getAbonnementById(id);
    }
}
