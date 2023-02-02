package com.progmatic.mvt;

import com.progmatic.mvt.model.*;

public class Controller implements AutoCloseable {

    private HibernateContext model = new HibernateContext();



    @Override
    public void close() throws Exception {
        model.close();
    }

    public void addBook() {
    }

    public void addAuthor() {
    }

    public void addStore() {
    }
}
