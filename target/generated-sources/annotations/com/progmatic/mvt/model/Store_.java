package com.progmatic.mvt.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Store.class)
public abstract class Store_ {

	public static volatile SingularAttribute<Store, Long> store_id;
	public static volatile SingularAttribute<Store, String> address;
	public static volatile SingularAttribute<Store, String> storeName;
	public static volatile SingularAttribute<Store, Boolean> isActive;
	public static volatile SingularAttribute<Store, Integer> stock;

	public static final String STORE_ID = "store_id";
	public static final String ADDRESS = "address";
	public static final String STORE_NAME = "storeName";
	public static final String IS_ACTIVE = "isActive";
	public static final String STOCK = "stock";

}

