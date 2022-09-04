package com.example.backendfinalproject.service;

import com.example.backendfinalproject.model.Abonnement;
import com.example.backendfinalproject.model.Client;
import com.example.backendfinalproject.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @GetMapping("/clients")
    public List<Client> getAllClient(){
       return clientRepository.findAll();
    }
    @GetMapping("/abonnement/{id}")
    public Optional<Client> getByClientId(Long id){
        return clientRepository.findById(id);
    }
}
