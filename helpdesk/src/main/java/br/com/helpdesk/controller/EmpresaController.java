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
	public String adiciona(@Valid Empresa empresa, List<Long> modulos, BindingResult result) {
		for (Long idModulo : modulos) {
			Modulo modulo = new Modulo();
			modulo = daoModulo.getById(idModulo);
			empresa.getModulos().add(modulo);
		}
		if(result.hasErrors()) {
			return "modulo/adicionar";
		}
		
		dao.adiciona(empresa);
		
		return "modulo/adicionado";
	}

	@RequestMapping("listarEmpresas")
	public String lista(Model model) {
		List<Empresa> empresas = dao.lista(Empresa.class);
		model.addAttribute("empresas", empresas);
		
		return "empresa/lista";
	}
	
}
