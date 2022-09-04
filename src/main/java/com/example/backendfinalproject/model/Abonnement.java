package com.example.backendfinalproject.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "abonnement")
@Data
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_abonnement")
    private int id;

    @Column(name = "category",nullable = false)
    private String abonnementCategory;

    @Column(name = "fin",nullable = false)
    private Date finAbonnement;

    @Column(name = "price")
    private double priceOfAbonnement;
}
