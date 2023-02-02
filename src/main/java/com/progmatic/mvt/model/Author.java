package com.progmatic.mvt.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Author {

    @OneToMany(mappedBy = "book")
    List<Book> bookList;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long author_id;

    String name;

    LocalDate dob;

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Long author_id) {
        this.author_id = author_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Author(){

    }

    @Override
    public String toString() {
        return "Author{" +
                "bookList=" + bookList +
                ", author_id=" + author_id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
