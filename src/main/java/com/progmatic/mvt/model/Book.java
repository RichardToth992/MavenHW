package com.progmatic.mvt.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Book {

    @ManyToOne
    Author author;

    @Id
    String isbn = isbnGenerator();

    String title;

    LocalDate dop;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbnGenerator();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDop() {
        return dop;
    }

    public void setDop(LocalDate dop) {
        this.dop = dop;
    }

    public String isbnGenerator(){
        return UUID.randomUUID().toString();
    }

    public Book (){
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", dop=" + dop +
                '}';
    }
}
