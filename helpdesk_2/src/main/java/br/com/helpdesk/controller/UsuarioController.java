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
import br.com.helpdesk.model.dao.PapelUsuarioDAO;
import br.com.helpdesk.model.dao.UsuarioDAO;
import br.com.helpdesk.model.entity.PapelUsuario;
import br.com.helpdesk.model.entity.TipoUsuario;
import br.com.helpdesk.model.entity.Usuario;
import br.com.helpdesk.model.entity.Empresa;

@Controller
@Transactional
public class UsuarioController {


	@Autowired
	private UsuarioDAO dao;
	
	@Autowired
	private EmpresaDAO daoEmpresa;
	
	@Autowired
	private PapelUsuarioDAO daoPapelUsuario;
	
	@RequestMapping("formAdicionarUsuario")
	public String formAdiciona(Model model) {
		List<Empresa> empresas = daoEmpresa.lista(Empresa.class);
		List<PapelUsuario> papeisUsuario = daoPapelUsuario.lista(PapelUsuario.class);
		model.addAttribute("empresas", empresas);
		model.addAttribute("papeisUsuario", papeisUsuario);
		return "usuario/adicionar";
	}
	
	@RequestMapping("adicionarUsuario")
	public String adiciona(@Valid Usuario usuario,Long idEmpresa, Long idPapelUsuario,  BindingResult result) {
		Empresa empresa = daoEmpresa.getById(idEmpresa);
		usuario.setEmpresa(empresa);
		PapelUsuario papelUsuario = daoPapelUsuario.getById(idPapelUsuario);
		usuario.setPapelUsuario(papelUsuario);
		if(result.hasErrors()) {
			return "usuario/adicionar";
		}
		
		dao.adiciona(usuario);
		
		return "usuario/adicionado";
	}
	
	@RequestMapping("listarUsuarios")
	public String lista(Model model) {
		List<Usuario> usuarios = dao.lista(Usuario.class);
		model.addAttribute("usuarios", usuarios);
		
		return "usuario/lista";
	}
	
	@RequestMapping("removerUsuario")
	public String remove(Usuario usuario) {
		dao.remove(usuario);
		
		return "redirect:listarUsuarios";
		
	}
	
	@RequestMapping("mostraUsuario")
	public String mostra(Long id, Model model) {

		List<Empresa> empresas = daoEmpresa.lista(Empresa.class);
		model.addAttribute("empresas", empresas);

		List<PapelUsuario> papeisUsuario = daoPapelUsuario.lista(PapelUsuario.class);
		model.addAttribute("papeisUsuario", papeisUsuario);

		model.addAttribute("usuario", dao.getById(id));
		
		return "usuario/mostra";
	}
	
	@RequestMapping("alterarUsuario")
	public String alterar(@Valid Usuario usuario,Long idEmpresa,Long idPapelUsuario, BindingResult result) {
		Empresa empresa = daoEmpresa.getById(idEmpresa);
		usuario.setEmpresa(empresa);

		PapelUsuario papelUsuario = daoPapelUsuario.getById(idPapelUsuario);
		usuario.setPapelUsuario(papelUsuario);

		if (result.hasErrors()) {
			return "usuario/mostra";
		}
		dao.altera(usuario);
		
		
		return "redirect:listarUsuarios";
	}
	
}
