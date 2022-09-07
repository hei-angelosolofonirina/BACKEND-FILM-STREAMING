package com.example.backendfinalproject.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "achat_film")
public class AchatFilm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long achatId;

    @Column(name = "achat_Time",nullable = false)
    @CreationTimestamp
    private Instant achatTime;

    @ManyToOne
    private Film film;

    @ManyToOne
    private Client client;
}
