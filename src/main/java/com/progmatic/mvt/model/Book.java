package com.progmatic.mvt.model;

import jakarta.persistence.*;

@Entity
public class Book {

    @ManyToOne
    Author author;



    @Id
    Long isbn;
}
