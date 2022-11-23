package com.example.springjpaexercise.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "author")
public class Author {
    @Id
    private Long id;
    private String name;
}
