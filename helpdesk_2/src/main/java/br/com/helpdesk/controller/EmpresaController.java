package br.com.helpdesk.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.helpdesk.model.dao.EmpresaDAO;
import br.com.helpdesk.model.dao.ModuloDAO;
import br.com.helpdesk.model.dao.SistemaDAO;
import br.com.helpdesk.model.entity.Empresa;
import br.com.helpdesk.model.entity.Modulo;
import br.com.helpdesk.model.entity.Sistema;


@Controller
@Transactional
public class EmpresaController {

	@Autowired
	private SistemaDAO daoSistema;
	
	@Autowired
	private ModuloDAO daoModulo;

	@Autowired
	private EmpresaDAO dao;
	
	@RequestMapping("formAdicionarEmpresa")
	public String formAdiciona(Model model) {
		List<Sistema> sistemas = daoSistema.lista(Sistema.class);
		model.addAttribute("sistemas", sistemas);
		return "empresa/adicionar";
	}
	
	@RequestMapping("adicionarEmpresa")
	public String adiciona(@Valid Empresa empresa, BindingResult result) {
		if(result.hasErrors()) {
			return "empresa/adicionar";
		}
		
		dao.adiciona(empresa);
		
		return "empresa/adicionado";
	}

	@RequestMapping("listarEmpresas")
	public String lista(Model model) {
		List<Empresa> empresas = dao.lista(Empresa.class);
		model.addAttribute("empresas", empresas);
		
		return "empresa/lista";
	}
	
	@RequestMapping("removerEmpresa")
	public String remove(Empresa empresa) {
		dao.remove(empresa);
		
		return "redirect:listarEmpresas";
		
	}
	
	@RequestMapping("mostraEmpresa")
	public String mostra(Long id, Model model) {
		model.addAttribute("empresa", dao.getById(id));
		
		return "empresa/mostra";
	}
	
	@RequestMapping("alterarEmpresa")
	public String alterar(@Valid Empresa empresa,BindingResult result) {
		if (result.hasErrors()) {
			return "empresa/mostra";
		}
		Empresa empresaAntes = dao.getById(empresa.getId());
		empresa.setModulos(empresaAntes.getModulos());
		dao.altera(empresa);
		
		
		return "redirect:listarEmpresas";
	}
	
	@RequestMapping("formVinculaModuloEmpresa")
	public String formVinculaModuloEmpresa(Long id, Model model) {
		model.addAttribute("empresa", dao.getById(id));
		model.addAttribute("sistemas", daoSistema.lista(Sistema.class));
		return "empresa/vinculamodulo";
	}
	
	
	@RequestMapping("adicionarModuloEmpresa")
	public String adicionaModuloEmpresa(Model model, Long idEmpresa, Long idModulo) {
		Empresa empresa = dao.getById(idEmpresa);
		Modulo modulo = daoModulo.getById(idModulo);
		empresa.getModulos().add(modulo);
		dao.altera(empresa);

		model.addAttribute("id", idEmpresa);
		return "redirect:formVinculaModuloEmpresa";
	}

	@RequestMapping("removerModuloEmpresa")
	public String removeModuloEmpresa(Model model, Long idEmpresa, Long idModulo) {
		Empresa empresa = dao.getById(idEmpresa);
		Modulo modulo = daoModulo.getById(idModulo);
		empresa.getModulos().remove(modulo);
		dao.altera(empresa);

		model.addAttribute("id", idEmpresa);
		return "redirect:formVinculaModuloEmpresa";
	}
	
	
}
