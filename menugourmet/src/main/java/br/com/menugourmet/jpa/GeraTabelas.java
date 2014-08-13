package br.com.menugourmet.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class GeraTabelas {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("menugourmet");
		
		factory.close();

	}

}
