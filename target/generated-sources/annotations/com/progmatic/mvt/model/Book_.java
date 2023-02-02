package com.progmatic.mvt.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Book.class)
public abstract class Book_ {

	public static volatile SingularAttribute<Book, LocalDate> dop;
	public static volatile SingularAttribute<Book, Author> author;
	public static volatile SingularAttribute<Book, String> isbn;
	public static volatile SingularAttribute<Book, String> title;

	public static final String DOP = "dop";
	public static final String AUTHOR = "author";
	public static final String ISBN = "isbn";
	public static final String TITLE = "title";

}

