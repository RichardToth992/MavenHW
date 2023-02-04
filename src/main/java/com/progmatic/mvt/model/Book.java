package com.progmatic.mvt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Book {

    @ManyToOne
    @JoinColumn
    Author author;

    @Id
    String isbn = isbnGenerator();

    String title;

    LocalDate dop;

    public String getAuthor() {
        return author.name;
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

    public Book() {
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


    // found this on stackoverflow
    public static String isbnGenerator()
    {
        String l;
        String b;
        String v;
        String checksum;

// Generate Random Numbers for L1L2-B1B2B3-V1V2
        double L1 = Math.random()*(10);
        double L2 = Math.random()*(10);

        double B1 = Math.random()*(10);
        double B2 = Math.random()*(10);
        double B3 = Math.random()*(10);

        double V1 = Math.random()*(10);
        double V2 = Math.random()*(10);

// Check that L1L2 > 0
        if((int)L1 == 0 && (int)L2 == 0) {
            L2++;
        }
// Check that L1B2B3 >= 100
        if((int)B1 == 0) {
            B1++;
        }
// Check that V1V2 > 0
        if((int)V1 == 0 && (int)V2 == 0) {
            V2++;
        }
// Compute check digit with hashOp method
        double C = (hashOp((int)L1) +L2 + hashOp((int)B1) +B2 + hashOp((int)B3) +V1 + hashOp((int)V2))%10;

// Convert the generated numbers to String
        l     = (int)L1+""+(int)L2;
        b          = (int)B1+""+(int)B2+""+(int)B3;
        v       = (int)V1+""+(int)V2;
        checksum        = (int)C+"";

        return l + "-" + b + "-" + v + "-" + checksum;
    }

    public static int hashOp(int i)
    {
        // used to determine C
        int doubled = 2 * i;
        if ( doubled >= 10 ) {
            doubled = doubled - 9;
        }
        return doubled;
    }
}
