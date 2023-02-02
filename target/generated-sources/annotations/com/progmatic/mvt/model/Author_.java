package com.progmatic.mvt.model;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Author.class)
public abstract class Author_ {

	public static volatile SingularAttribute<Author, LocalDate> dob;
	public static volatile SingularAttribute<Author, String> name;
	public static volatile SingularAttribute<Author, Long> author_id;
	public static volatile ListAttribute<Author, Book> bookList;

	public static final String DOB = "dob";
	public static final String NAME = "name";
	public static final String AUTHOR_ID = "author_id";
	public static final String BOOK_LIST = "bookList";

}

