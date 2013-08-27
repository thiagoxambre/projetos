package br.com.helpdesk.model.util;


import java.util.List;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;


@Repository
public abstract class DAO <T extends AbstractEntity> {
	
	@PersistenceContext
	private EntityManager manager;
	
	
	public void adiciona(T entity) {
		manager.persist(entity);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> lista(Class<T> classe) {
		return manager.createQuery("select o from  " + classe.getSimpleName() + " as o").getResultList();
	}
	
	public void remove(T entity) {
		T encontrado = getById(entity.getId());
		manager.remove(encontrado);
	}
	
	public void altera(T entity) {
		manager.merge(entity);
	}
	
	@SuppressWarnings("unchecked")
	public T getById(Long id) {
		return (T) manager.find(getTypeClass(), id);
	}
	
	private Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return clazz;
    }	

}
