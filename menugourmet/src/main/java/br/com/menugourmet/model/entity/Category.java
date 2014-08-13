package br.com.menugourmet.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.menugourmet.model.util.AbstractEntity;

@Entity
@Table(name="category")
public class Category extends AbstractEntity {

	@NotNull(message="Campo deve ser preenchido") @NotEmpty(message="Campo deve ser preenchido")
	private String name;
	
	private int sequence;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	@ManyToOne(targetEntity=Business.class)
	@JoinColumn(name="business_id")
	private Business business;
	
	@OneToMany(mappedBy="category", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Product> products;

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}
	
	
}
