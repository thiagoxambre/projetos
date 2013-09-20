package br.com.helpdesk.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.helpdesk.model.util.AbstractEntity;


@Entity
@Table(name="tipo_chamado")
public class TipoChamado extends AbstractEntity {
	
	@NotNull(message="Nome deve ser preenchido") @NotEmpty(message="Nome deve ser preenchido")
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
