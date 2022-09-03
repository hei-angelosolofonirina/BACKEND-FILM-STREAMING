package com.example.backendfinalproject.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

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
    @Column(name = "posting_date",nullable = false)
    private Date postingDate;
    @ManyToOne
    private Film film;
}
