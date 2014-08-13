package br.com.menugourmet.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.menugourmet.model.entity.Business;
import br.com.menugourmet.model.entity.Category;
import br.com.menugourmet.model.entity.Product;
import br.com.menugourmet.model.util.DAO;

@Repository
public class ProductDAO extends DAO<Product> {
	
	public List<Product> getProductsByCategoryOrderBySequence (Category category) {
		return  manager.createQuery("select p from Product as p where p.category = " + category.getId().toString() + "order by p.sequence").getResultList();
	}
	
	public List<Product> getProductsByBusinessOrderBySequence (Business business) {
		return  manager.createQuery("select p from Product as p where p.business = " + business.getId().toString() + "order by p.sequence").getResultList();
	}
	
	public List<Product> listOrderBySequence() {
		return  manager.createQuery("select p from Product as p order by p.sequence").getResultList();
	}

}
