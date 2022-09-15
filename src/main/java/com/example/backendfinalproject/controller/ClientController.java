package com.example.backendfinalproject.controller;

import com.example.backendfinalproject.model.Client;
import com.example.backendfinalproject.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/client")
    public Client createClient(@RequestBody Client client){
        return clientService.addClient(client);
    }
    @PostMapping("/clients")
    public List<Client> addManyClients(@RequestBody List<Client> listClient){
        return clientService.createManyClient(listClient);}
    @GetMapping("/clients")
    public List<Client> getAllClients(){
        return clientService.getAllClient();
    }
    @DeleteMapping("/clients")
    private void deleteClientById(Integer id){
        return clientService.deleteById(id);
    }
    @GetMapping("/clients/{id}")
    public Optional<Client> getByClientId(@PathVariable Long id){
        return clientService.getByIdClient(id);
    }

}
