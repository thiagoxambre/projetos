package br.com.menugourmet.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.menugourmet.model.entity.Business;
import br.com.menugourmet.model.entity.Category;
import br.com.menugourmet.model.util.DAO;

@Repository
public class CategoryDAO extends DAO<Category> {
	
	public List<Category> getCategoriesByBusinessOrderBySequence (Business business) {
		return  manager.createQuery("select c from  Category as c where c.business = " + business.getId().toString() + " order by c.sequence").getResultList();
	}
	
	public List<Category> listBySequence () {
		return  manager.createQuery("select c from  Category as c order by c.sequence").getResultList();
	}

}
