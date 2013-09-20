package br.com.helpdesk.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.helpdesk.model.dao.TipoChamadoDAO;
import br.com.helpdesk.model.entity.TipoChamado;

@Controller
@Transactional
public class TipoChamadoController {

	
	@Autowired
	private TipoChamadoDAO dao;
	
	@RequestMapping("formAdicionarTipoChamado")
	public String formAdiciona() {
		return "tipochamado/adicionar";
	}
	
	@RequestMapping("adicionarTipoChamado")
	public String adiciona(@Valid TipoChamado tipoChamado,BindingResult result) {
		if(result.hasErrors()) {
			return "tipochamado/adicionar";
		}
		
		dao.adiciona(tipoChamado);
		
		return "tipochamado/adicionado";
	}
	
	@RequestMapping("listarTipoChamados")
	public String lista(Model model) {
		List<TipoChamado> tipoChamados = dao.lista(TipoChamado.class);
		model.addAttribute("tipoChamados", tipoChamados);
		
		return "tipochamado/lista";
	}
	
	@RequestMapping("removerTipoChamado")
	public String remove(TipoChamado tipoChamado) {
		dao.remove(tipoChamado);
		
		return "redirect:listarTipoChamados";
		
	}
	
	@RequestMapping("mostraTipoChamado")
	public String mostra(Long id, Model model) {
		model.addAttribute("tipoChamado", dao.getById(id));
		
		return "tipochamado/mostra";
	}
	
	@RequestMapping("alterarTipoChamado")
	public String alterar(@Valid TipoChamado tipoChamado, BindingResult result) {
		if (result.hasErrors()) {
			return "tipochamado/mostra";
		}
		dao.altera(tipoChamado);
		
		
		return "redirect:listarTipoChamados";
	}
	

}
