package br.com.menugourmet.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.menugourmet.model.entity.User;
import br.com.menugourmet.model.util.DAO;

@Repository
public class UserDAO extends DAO<User> {
	
	public User getUsuarioByLogin(String login) {

		@SuppressWarnings("unchecked")
		List<User> usuarios =  manager.createQuery("select u from  User as u where u.login = '" + login + "'").getResultList();
		
		return usuarios.get(0);
	}

}
