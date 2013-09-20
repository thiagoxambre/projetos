package br.com.helpdesk.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import br.com.helpdesk.model.util.AbstractEntity;

@Entity
@Table(name="usuario")
public class Usuario extends AbstractEntity {
	
	@Column(unique=true)
	@NotNull(message="Login deve ser preenchido") @NotEmpty(message="Login deve ser preenchido")
	private String login;
	@NotNull(message="Senha deve ser preenchida") @NotEmpty(message="Senha deve ser preenchida")
	private String senha;
	@NotNull(message="Nome deve ser preenchido") @NotEmpty(message="Nome deve ser preenchido")
	private String nome;
	@Email(message="Email inválido")
	private String email;
	private String fone;

	@ManyToOne(targetEntity=Empresa.class)
	@JoinColumn(name="empresa_id")
	private Empresa empresa;
	
	@ManyToOne(targetEntity=PapelUsuario.class)
	@JoinColumn(name="papel_id")
	private PapelUsuario papelUsuario;
	
	private Boolean ativo;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public PapelUsuario getPapelUsuario() {
		return papelUsuario;
	}

	public void setPapelUsuario(PapelUsuario papelUsuario) {
		this.papelUsuario = papelUsuario;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	
	

}
