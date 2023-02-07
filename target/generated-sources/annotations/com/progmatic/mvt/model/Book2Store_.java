package com.progmatic.mvt.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Book2Store.class)
public abstract class Book2Store_ {

	public static volatile SingularAttribute<Book2Store, Book> book;
	public static volatile SingularAttribute<Book2Store, Book2StoreID> id;
	public static volatile SingularAttribute<Book2Store, Store> store;

	public static final String BOOK = "book";
	public static final String ID = "id";
	public static final String STORE = "store";

}

