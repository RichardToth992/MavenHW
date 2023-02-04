package com.progmatic.mvt;

import com.progmatic.mvt.model.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.SelectionQuery;

import java.time.LocalDate;
import java.util.Scanner;

public class Controller implements AutoCloseable {

    private final HibernateContext model = new HibernateContext();

    @Override
    public void close() throws Exception {
        model.close();
    }

    public void addBook(String title, Author author) {
        Book book = new Book();

        book.setTitle(title);
        book.setAuthor(author);

        Session session = model.getSession();
        Transaction tx = session.beginTransaction();
        session.persist(book);
        session.flush();
        session.getTransaction().commit();
    }

    public void modifyBook(String title) {

    }

    public Author getBookByTitle(String title) {
        Session session = model.getSession();
        Transaction tx = session.beginTransaction();

        SelectionQuery<Book> a = session.createSelectionQuery("SELECT b FROM Book b", Book.class);

        for (Book x : a.list()) {
            if (title.equalsIgnoreCase(x.getTitle())){
                System.out.println(x);
            }
        }
        session.clear();
        session.getTransaction().commit();
        return null;
    }

    public void deleteAuthor(String name) {
        Session session = model.getSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Author a = session.find(Author.class, name);
            session.remove(a);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        }
    }

    public void addAuthor(String name, LocalDate dob) {
        Author author = new Author();

        author.setName(name);
        author.setDob(dob);

        Session session = model.getSession();
        Transaction tx = session.beginTransaction();
        session.persist(author);
        session.flush();
        session.getTransaction().commit();
    }

    public void addStore() {
    }

    public Author getAuthorByName(String name) {
        Session session = model.getSession();
        Transaction tx = session.beginTransaction();

        SelectionQuery<Author> a = session.createSelectionQuery("SELECT a FROM Author a", Author.class);

        for (Author x : a.list()) {
            if (name.equalsIgnoreCase(x.getName())){
                System.out.println(x);
            }
        }
        session.clear();
        session.getTransaction().commit();
        return null;
    }

    public void modifyAuthorName(String name, String newName) {
        Author author = getAuthorByName(name);

        author.setName(newName);
        Session session = model.getSession();
        Transaction tx = session.beginTransaction();
        session.persist(author);
        session.flush();
        session.getTransaction().commit();
    }

    public void modifyAuthorDob(String name, LocalDate newDob) {
        Author author = getAuthorByName(name);

        author.setDob(newDob);
        Session session = model.getSession();
        Transaction tx = session.getTransaction();
        session.persist(author);
        session.flush();
        session.getTransaction().commit();
    }
}
