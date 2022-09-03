package com.example.backendfinalproject.repository;

import com.example.backendfinalproject.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;



public interface FilmRepository extends JpaRepository<Film,Integer> {
}
