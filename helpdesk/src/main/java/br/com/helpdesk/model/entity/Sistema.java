package br.com.helpdesk.model.entity;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.helpdesk.model.util.AbstractEntity;

@Entity
@Table(name="sistema")
public class Sistema extends AbstractEntity {
	
	@NotNull(message="Nome deve ser preenchido") @Size(min=1,message="Nome deve ser preenchido")
	private String nome;
	
	@OneToMany(mappedBy="sistema", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Modulo> modulos;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}
	
	
	

}
