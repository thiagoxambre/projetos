package br.com.helpdesk.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.helpdesk.model.util.AbstractEntity;

@Entity
@Table(name="papel")
public class PapelUsuario extends AbstractEntity {
	
	@NotNull(message="Nome deve ser preenchido") @NotEmpty(message="Nome deve ser preenchido")
	private String permissao;
	
	private String tipo;

	@OneToMany(mappedBy="papelUsuario", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Usuario> usuarios;
	
	
	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	

}
