package ru.edu.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Сущность описывающая авторов книг
 */
@Entity
@Table(name = "author")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String phone;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

}

