package com.jpa.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Utilidades {
	
	public EntityManagerFactory ObtenerEntityManager()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoPruebaJPA2");
		return emf;
	}
	
}
