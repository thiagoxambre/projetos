package br.com.helpdesk.model.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import br.com.helpdesk.model.util.AbstractEntity;

@Entity
@Table(name="empresa")
public class Empresa extends AbstractEntity {
	
	@NotNull(message="Nome deve ser preenchido") @NotEmpty(message="Nome deve ser preenchido")
	private String nome;

	private String fone;
	private String endereco;
	private String cidade;
	
	@Email(message="Email inválido")
	private String email;
	
	private String responsavel;

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="empresa_modulo", joinColumns = @JoinColumn(columnDefinition="empresa_id"), inverseJoinColumns = @JoinColumn(columnDefinition="modulo_id"))
	private Set<Modulo> modulos;

	@OneToMany(mappedBy="empresa", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Usuario> usuarios;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Set<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(Set<Modulo> modulos) {
		this.modulos = modulos;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	

}
