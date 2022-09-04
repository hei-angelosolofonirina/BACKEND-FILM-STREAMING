package com.example.backendfinalproject.service;

import com.example.backendfinalproject.model.Abonnement;
import com.example.backendfinalproject.repository.AbonnementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class AbonnementService {
    @Autowired
    AbonnementRepository abonnementRepository;

    public List<Abonnement> getAllAbonnements() {
        return abonnementRepository.findAll();
    }

    public Optional<Abonnement> getAbonnementById(@PathVariable Integer id) {
        if (id == null) {
            return null;
        } else {
            return abonnementRepository.findById(id);
        }
    }
}
