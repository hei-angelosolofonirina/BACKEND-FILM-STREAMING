package com.example.backendfinalproject.service;


import com.example.backendfinalproject.model.Client;
import com.example.backendfinalproject.model.Commentaire;
import com.example.backendfinalproject.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client addClient(Client client){
        return clientRepository.save(client);
    }
    @Transactional
    public List<Client> createManyClient(List<Client> listClient){
        return clientRepository.saveAll(listClient);
    }

    public List<Client> getAllClient(){
       return clientRepository.findAll();
    }
    public void deleteById(Integer id) {
    clientRepository.deleteById(id);
    }

    public Optional<Client> getByIdClient(Long id){
        return clientRepository.findById(id);
    }
}
