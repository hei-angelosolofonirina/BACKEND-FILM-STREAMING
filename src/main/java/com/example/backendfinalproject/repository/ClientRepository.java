package com.example.backendfinalproject.repository;

import com.example.backendfinalproject.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
