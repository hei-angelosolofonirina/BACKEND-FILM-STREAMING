package com.example.backendfinalproject.service;

import com.example.backendfinalproject.model.Abonnement;
import com.example.backendfinalproject.repository.AbonnementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AbonnementService {
    @Autowired
    AbonnementRepository abonnementRepository;
    public Abonnement createAbonnement(Abonnement abonnement){
        return abonnementRepository.save(abonnement);
    }

    public List<Abonnement> createManyAbonnement(List<Abonnement> list){
        return abonnementRepository.saveAll(list);
    }

    public List<Abonnement> getAllAbonnements() {
        return abonnementRepository.findAll();
    }

    public Optional<Abonnement> getAbonnementById(Integer id) {
        if (id == null) {
            return null;
        } else {
            return abonnementRepository.findById(id);
        }
    }
}
