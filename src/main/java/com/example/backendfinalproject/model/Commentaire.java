package com.example.backendfinalproject.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Optional;

import com.example.backendfinalproject.model.Client;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "commentaire")
public class Commentaire implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comsa")
    private int id;
    @Column(nullable = false)
    private String content;
    @CreationTimestamp
    @Column(name = "posting_date",nullable = false)
    private Instant postingDate;
    @OneToOne
    private Client client;
    @ManyToOne
    private Film film;
}
