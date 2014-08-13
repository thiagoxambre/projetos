package br.com.menugourmet.controller;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.menugourmet.model.dao.BusinessDAO;
import br.com.menugourmet.model.entity.Business;


@Controller
@Transactional
public class BusinessController {

/*
	@Autowired
	private SistemaDAO daoSistema;
	
	@Autowired
	private ModuloDAO daoModulo;
*/
	@Autowired
	private BusinessDAO dao;
	

	@RequestMapping("admin/listBusiness")
	public String lista(Model model) {
		List<Business> businesses = dao.list();
		model.addAttribute("empresas", businesses);
		model.addAttribute("menu", 4);
		model.addAttribute("submenu", 1);
		
		return "admin/business/list";
	}
	
/*	
	@RequestMapping("admin/formAdicionarEmpresa")
	public String formAdiciona(Model model) {
		List<Sistema> sistemas = daoSistema.lista();
		model.addAttribute("sistemas", sistemas);
		model.addAttribute("menu", 4);
		model.addAttribute("submenu", 2);
		return "admin/empresa/adicionar";
	}
	
	@RequestMapping("admin/adicionarEmpresa")
	public String adiciona(@Valid Empresa empresa, BindingResult result) {
		if(result.hasErrors()) {
			return "admin/empresa/adicionar";
		}
		
		dao.adiciona(empresa);
		
		return "admin/empresa/adicionado";
	}

	
	@RequestMapping("admin/removerEmpresa")
	public String remove(Empresa empresa) {
		dao.remove(empresa);
		
		return "redirect:/admin/listarEmpresas";
		
	}
	
	@RequestMapping("admin/mostraEmpresa")
	public String mostra(Long id, Model model) {
		model.addAttribute("empresa", dao.getById(id));
		
		return "admin/empresa/mostra";
	}
	
	@RequestMapping("admin/alterarEmpresa")
	public String alterar(@Valid Empresa empresa,BindingResult result) {
		if (result.hasErrors()) {
			return "admin/empresa/mostra";
		}
		Empresa empresaAntes = dao.getById(empresa.getId());
		empresa.setModulos(empresaAntes.getModulos());
		dao.altera(empresa);
		
		
		return "redirect:/admin/listarEmpresas";
	}
	
	@RequestMapping("admin/formVinculaModuloEmpresa")
	@Transactional
	public String formVinculaModuloEmpresa(Long id, Model model) {
		Empresa empresa = dao.getById(id);
		Hibernate.initialize(empresa.getModulos());
		model.addAttribute("empresa", empresa);
		List<Sistema> sistemas = daoSistema.lista();
		for(Sistema sistema : sistemas) {
			Hibernate.initialize(sistema.getModulos());
		}
		model.addAttribute("sistemas", sistemas);
		return "admin/empresa/vinculamodulo";
	}
	
	
	@RequestMapping("admin/adicionarModuloEmpresa")
	public String adicionaModuloEmpresa(Model model, Long idEmpresa, Long idModulo) {
		Empresa empresa = dao.getById(idEmpresa);
		Modulo modulo = daoModulo.getById(idModulo);
		empresa.getModulos().add(modulo);
		dao.altera(empresa);

		model.addAttribute("id", idEmpresa);
		return "redirect:/admin/formVinculaModuloEmpresa";
	}

	@RequestMapping("admin/removerModuloEmpresa")
	public String removeModuloEmpresa(Model model, Long idEmpresa, Long idModulo) {
		Empresa empresa = dao.getById(idEmpresa);
		Modulo modulo = daoModulo.getById(idModulo);
		empresa.getModulos().remove(modulo);
		dao.altera(empresa);

		model.addAttribute("id", idEmpresa);
		return "redirect:/admin/formVinculaModuloEmpresa";
	}
	
*/	
}
