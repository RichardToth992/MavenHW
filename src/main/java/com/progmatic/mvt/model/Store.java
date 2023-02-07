package com.progmatic.mvt.model;

import jakarta.persistence.*;

@Entity
@Table
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long store_id;

    String storeName;
    boolean isActive;

    String address;

    public Long getStore_id() {
        return store_id;
    }

    public void setStore_id(Long store_id) {
        this.store_id = store_id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public boolean getActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Store(){}

    @Override
    public String toString() {
        return "Store{" +
                "store_id=" + store_id +
                ", storeName='" + storeName + '\'' +
                ", isActive=" + isActive +
                ", address='" + address + '\'' +
                '}';
    }
}
