package com.example.backendfinalproject.repository;

import com.example.backendfinalproject.model.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement,Integer> {
}
