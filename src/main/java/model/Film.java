package model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "Film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_film;

    @Column(name = "title",nullable = false,length = 100)
    private String title;

    @Column(name = "genre",nullable = false,length=50)
    private String genre;

    @Column(name = "description",nullable = false)
    private String description;

}
