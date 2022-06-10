package com.criscode.proyectocris.utilities;

import jakarta.persistence.Persistence;

public class JPAUtil {

	private static final String PERSISTENCE_UNIT_NAME = "UPERSISTENCE";
	private static EntityManagerFactory factory factory;
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if (factory !=null) {
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factory;
	}
	public static void shudown() {
		if (factory !=null) {
	if(factory.close();
			
		}
	}
}
