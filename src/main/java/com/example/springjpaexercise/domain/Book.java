package com.example.springjpaexercise.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book")
public class Book {
    @Id
    private Long id;
    private String name;
    private Long authorId;
    private Long publisherId;

}
