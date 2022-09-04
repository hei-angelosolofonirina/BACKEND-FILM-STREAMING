package com.example.backendfinalproject.controller;

import com.example.backendfinalproject.model.Client;
import com.example.backendfinalproject.repository.ClientRepository;
import com.example.backendfinalproject.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    ClientService clientService;
    @GetMapping("/clients")
    public List<Client> getAllClients(){
        return clientService.getAllClient();
    }
}
