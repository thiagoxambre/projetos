package br.com.menugourmet.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.menugourmet.model.dao.UserDAO;
import br.com.menugourmet.model.entity.User;

@Controller
@SessionAttributes("usuarioLogado")
public class LoginController {

	@Autowired
	private UserDAO daoUser;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "redirect:home";
	}

	@RequestMapping("formLogin")
	public String formLogin() {
		return "login";
	}

	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String printWelcome(ModelMap model, Principal principal ) {
		String login = principal.getName();
		User user = daoUser.getUsuarioByLogin(login);
		model.addAttribute("userLogon", user);
		String name = principal.getName();
		model.addAttribute("username", name);
		return "home";
 
	}
 
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
 
		return "login";
 
	}
 
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
 
		model.addAttribute("error", "true");
		return "login";
 
	}
 
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
 
		return "login";
 
	}
 	
	@RequestMapping(value="/acessonegado", method = RequestMethod.GET)
	public String acessoNegado(ModelMap model) {
 
		return "acessonegado";
 
	}

}
