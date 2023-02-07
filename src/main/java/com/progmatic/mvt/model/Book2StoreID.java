package com.progmatic.mvt.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Book2StoreID implements Serializable {
    public Long isbn;
    public Long store_id;

    public Book2StoreID(){}

    public Book2StoreID(Long isbn, Long store_id) {
        this.isbn = isbn;
        this.store_id = store_id;
    }

    // equals and hashCode methods


    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public Long getStore_id() {
        return store_id;
    }

    public void setStore_id(Long store_id) {
        this.store_id = store_id;
    }
}