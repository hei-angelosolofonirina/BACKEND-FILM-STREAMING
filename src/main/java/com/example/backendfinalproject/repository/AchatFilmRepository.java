package com.example.backendfinalproject.repository;

import com.example.backendfinalproject.model.AchatFilm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchatFilmRepository extends JpaRepository<AchatFilm,Long> {
}
