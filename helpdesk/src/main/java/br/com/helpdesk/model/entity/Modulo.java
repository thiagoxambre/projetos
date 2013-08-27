package br.com.helpdesk.model.entity;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.helpdesk.model.util.AbstractEntity;

@Entity
@Table(name="modulo")
public class Modulo extends AbstractEntity {
	
	@NotNull(message="Nome deve ser preechido") @Size(min=1,message="Nome deve ser preenchido")
	private String nome;
	
	@ManyToOne(targetEntity=Sistema.class)
	@JoinColumn(name="sistema_id")
	private Sistema sistema;
	
	@ManyToMany(mappedBy="modulos")
	private List<Empresa> empresas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}
	
	
	

}
