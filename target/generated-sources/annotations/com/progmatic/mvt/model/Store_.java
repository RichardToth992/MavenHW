package com.progmatic.mvt.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Store.class)
public abstract class Store_ {

	public static volatile SingularAttribute<Store, Long> store_id;
	public static volatile SingularAttribute<Store, String> city;
	public static volatile SingularAttribute<Store, String> street;
	public static volatile SingularAttribute<Store, Integer> postalCode;
	public static volatile SingularAttribute<Store, Integer> houseNumber;

	public static final String STORE_ID = "store_id";
	public static final String CITY = "city";
	public static final String STREET = "street";
	public static final String POSTAL_CODE = "postalCode";
	public static final String HOUSE_NUMBER = "houseNumber";

}

