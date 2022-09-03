package com.example.backendfinalproject.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "film")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Film implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_film")
    private int id;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "genre",nullable = false)
    private String genre;

    @Column(name = "description")
    private String description;
}
