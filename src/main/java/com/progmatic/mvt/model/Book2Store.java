package com.progmatic.mvt.model;

import jakarta.persistence.*;

@Entity
@Table(name = "book_2_store")
public class Book2Store {
    @EmbeddedId
    private Book2StoreID id = new Book2StoreID();

    @ManyToOne
    @MapsId

    private Book book;
    @ManyToOne
    @MapsId("store_id")
//    @JoinColumn(name = "course_id")
    private Store store;

    public Book2Store(Long id, Long store_id) {
        this.id = new Book2StoreID(id, store_id);
    }

    public Book2StoreID getId() {
        return id;
    }

    public void setId(Book2StoreID id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
