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
public class SistemaDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	
	public void adiciona(Sistema sistema) {
		manager.persist(sistema);
	}
	
	public List<Sistema> lista() {
		return manager.createQuery("select s from Sistema as s").getResultList();
	}
	
	public void remove(Sistema sistema) {
		Sistema encontrado = manager.find(Sistema.class, sistema.getId());
		manager.remove(encontrado);
	}
	
	public void altera(Sistema sistema) {
		manager.merge(sistema);
	}
	
	public	Sistema getById(Long id) {
		return manager.find(Sistema.class, id);
	}

}
