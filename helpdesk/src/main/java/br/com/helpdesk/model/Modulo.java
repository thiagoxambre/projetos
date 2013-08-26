package br.com.helpdesk.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name="modulo")
public class Modulo extends AbstractEntity implements Serializable {
	
	@NotNull(message="Nome deve ser preechido") @Size(min=1,message="Nome deve ser preenchido")
	private String nome;
	
	@ManyToOne(targetEntity=Sistema.class)
	@JoinColumn(name="sistema_id")
	private Sistema sistema;

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
	
	
	

}
