package br.com.menugourmet.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import br.com.menugourmet.model.util.AbstractEntity;

@Entity
@Table(name="user")
public class User extends AbstractEntity {
	
	@Column(unique=true)
	@NotNull(message="Login deve ser preenchido") @NotEmpty(message="Login deve ser preenchido")
	private String login;
	@NotNull(message="Senha deve ser preenchida") @NotEmpty(message="Senha deve ser preenchida")
	private String password;
	@NotNull(message="Nome deve ser preenchido") @NotEmpty(message="Nome deve ser preenchido")
	private String name;
	@Email(message="Email inválido")
	private String email;
	private String phone;

	@ManyToOne(targetEntity=Business.class)
	@JoinColumn(name="empresa_id")
	private Business business;
	
	@ManyToOne(targetEntity=Role.class)
	@JoinColumn(name="role_id")
	private Role role;
	
	private Boolean active;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	


	
	

}
