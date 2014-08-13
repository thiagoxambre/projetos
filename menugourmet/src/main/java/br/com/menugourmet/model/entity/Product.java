package br.com.menugourmet.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.menugourmet.model.util.AbstractEntity;

@Entity
@Table(name="product")
public class Product extends AbstractEntity {

	@NotNull(message="Campo deve ser preenchido") @NotEmpty(message="Campo deve ser preenchido")
	private String name;

	private String description;
	
	private double price;
	
	private int sequence;
	
	@Lob
	@Column(columnDefinition="mediumblob")
	private byte[] photo;

	@ManyToOne(targetEntity=Business.class)
	@JoinColumn(name="business_id")
	private Business business;

	@ManyToOne(targetEntity=Category.class)
	@JoinColumn(name="category_id")
	private Category category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	
}
