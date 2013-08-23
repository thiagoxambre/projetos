package br.com.helpdesk.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ModuloDao {
	
	@PersistenceContext
	private EntityManager manager;

	public void adiciona(Modulo modulo) {
		manager.persist(modulo);
	}
	
	public List<Modulo> lista() {
		return manager.createQuery("select m from Modulo as m").getResultList();
	}
	
	public void remove(Modulo modulo) {
		Modulo encontrado = manager.find(Modulo.class, modulo.getId());
		manager.remove(encontrado);
	}
	
	public void altera(Modulo modulo) {
		manager.merge(modulo);
	}
	
	public	Modulo getById(Long id) {
		return manager.find(Modulo.class, id);
	}

	
	
}
