package br.com.menugourmet.model.dao;

import org.springframework.stereotype.Repository;

import br.com.menugourmet.model.entity.Business;
import br.com.menugourmet.model.util.DAO;

@Repository
public class BusinessDAO extends DAO<Business> {
	
	public boolean isRegistered () {
		int totalBusiness =  (Integer) manager.createQuery("select count(b) from  Business as b").getParameterValue(0);
		if (totalBusiness == 0)
			return false;
		else
			return true;
	}

}
