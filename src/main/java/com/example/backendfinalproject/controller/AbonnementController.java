package com.example.backendfinalproject.controller;

import com.example.backendfinalproject.model.Abonnement;
import com.example.backendfinalproject.service.AbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AbonnementController {
    @Autowired
    AbonnementService abonnementService;
    @PostMapping("/abonnement")
    public Abonnement addAnAbonnement(@RequestBody Abonnement abonnement){
        return abonnementService.createAbonnement(abonnement);
    }
    @PostMapping("/abonnements")
    public List<Abonnement> addManyAbonnement(@RequestBody List<Abonnement> list){
        return abonnementService.createManyAbonnement(list);
    }
    @GetMapping("/abonnements")
    public List<Abonnement> getAllAbonnement(){
        return abonnementService.getAllAbonnements();
    }
    @DeleteMapping("/abonnements")
    public void deleteAbonnementById(Integer id){
        return abonnementService.deleteById(id)
    }
    @GetMapping("/abonnements/{id}")
    public Optional<Abonnement> getAbonById(Integer id){
        return abonnementService.getAbonnementById(id);
    }
}
