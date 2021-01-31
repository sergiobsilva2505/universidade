package br.com.sbs.universidade.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("unesJPA");

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
	public void close(EntityManager em) {
		em.close();
	}

}
