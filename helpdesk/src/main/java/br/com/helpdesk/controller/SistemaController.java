package br.com.helpdesk.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.helpdesk.model.Sistema;
import br.com.helpdesk.model.SistemaDAO;

@Controller
@Transactional
public class SistemaController {

	
	@Autowired
	private SistemaDAO dao;
	
	@RequestMapping("formAdicionarSistema")
	public String formAdiciona() {
		return "sistema/adicionar";
	}
	
	@RequestMapping("adicionarSistema")
	public String adiciona(@Valid Sistema sistema,BindingResult result) {
		if(result.hasErrors()) {
			return "sistema/adicionar";
		}
		
		dao.adiciona(sistema);
		
		return "sistema/adicionado";
	}
	
	@RequestMapping("listarSistemas")
	public String lista(Model model) {
		List<Sistema> sistemas = dao.lista(Sistema.class);
		model.addAttribute("sistemas", sistemas);
		
		return "sistema/lista";
	}
	
	@RequestMapping("removerSistema")
	public String remove(Sistema sistema) {
		dao.remove(sistema);
		
		return "redirect:listarSistemas";
		
	}
	
	@RequestMapping("mostraSistema")
	public String mostra(Long id, Model model) {
		model.addAttribute("sistema", dao.getById(id));
		
		return "sistema/mostra";
	}
	
	@RequestMapping("alterarSistema")
	public String alterar(@Valid Sistema sistema, BindingResult result) {
		if (result.hasErrors()) {
			return "sistema/mostra";
		}
		dao.altera(sistema);
		
		
		return "redirect:listarSistemas";
	}
}
