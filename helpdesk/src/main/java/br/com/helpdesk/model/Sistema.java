package br.com.helpdesk.model;

import java.io.Serializable;
import java.util.Collection;





import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name="sistema")
public class Sistema extends AbstractEntity implements Serializable {
	
	@NotNull(message="Nome deve ser preenchido") @Size(min=1,message="Nome deve ser preenchido")
	private String nome;
	
	@OneToMany(mappedBy="sistema", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private Collection<Modulo> modulos;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(Collection<Modulo> modulos) {
		this.modulos = modulos;
	}
	
	
	

}
