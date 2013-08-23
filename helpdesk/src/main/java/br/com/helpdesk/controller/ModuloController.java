package br.com.helpdesk.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.helpdesk.model.Modulo;
import br.com.helpdesk.model.ModuloDao;
import br.com.helpdesk.model.Sistema;
import br.com.helpdesk.model.SistemaDao;

@Controller
@Transactional
public class ModuloController {

	@Autowired
	private ModuloDao dao;
	
	@Autowired
	private SistemaDao daoSistema;
	
	@RequestMapping("formAdicionarModulo")
	public String formAdiciona(Model model) {
		List<Sistema> sistemas = daoSistema.lista();
		model.addAttribute("sistemas", sistemas);
		return "modulo/adicionar";
	}
	
	@RequestMapping("adicionarModulo")
	public String adiciona(@Valid Modulo modulo,Long idSistema, BindingResult result) {
		Sistema sistema = daoSistema.getById(idSistema);
		modulo.setSistema(sistema);
		if(result.hasErrors()) {
			return "modulo/adicionar";
		}
		
		dao.adiciona(modulo);
		
		return "modulo/adicionado";
	}
	
	@RequestMapping("listarModulos")
	public String lista(Model model) {
		List<Modulo> modulos = dao.lista();
		model.addAttribute("modulos", modulos);
		
		return "modulo/lista";
	}
	
	@RequestMapping("removerModulo")
	public String remove(Modulo modulo) {
		dao.remove(modulo);
		
		return "redirect:listarModulos";
		
	}
	
	@RequestMapping("mostraModulo")
	public String mostra(Long id, Model model) {
		// Carrega sistemas para o combobox
		List<Sistema> sistemas = daoSistema.lista();
		model.addAttribute("sistemas", sistemas);

		model.addAttribute("modulo", dao.getById(id));
		
		return "modulo/mostra";
	}
	
	@RequestMapping("alterarModulo")
	public String alterar(@Valid Modulo modulo,Long idSistema, BindingResult result) {
		Sistema sistema = daoSistema.getById(idSistema);
		modulo.setSistema(sistema);

		if (result.hasErrors()) {
			return "modulo/mostra";
		}
		dao.altera(modulo);
		
		
		return "redirect:listarModulos";
	}

}
