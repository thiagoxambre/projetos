package br.com.menugourmet.model.util;


import java.util.List;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public abstract class DAO <T extends AbstractEntity> {
	
	@PersistenceContext
	protected EntityManager manager;
	
	
	public void add(T entity) {
		manager.persist(entity);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> list() {
		return manager.createQuery("select o from  " + getTypeClass().getSimpleName() + " as o").getResultList();
	}
	
	public void remove(T entity) {
		T encontrado = (T) manager.getReference(getTypeClass(), entity.getId());
		manager.remove(encontrado);
	}
	
	public void alter(T entity) {
		manager.merge(entity);
	}
	
	@SuppressWarnings("unchecked")
	public T getById(Long id) {
		if(id != null)
			return (T) manager.find(getTypeClass(), id);
		return null;
	}
	
	private Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return clazz;
    }	

}
