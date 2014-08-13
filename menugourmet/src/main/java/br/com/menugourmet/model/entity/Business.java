package br.com.menugourmet.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.menugourmet.model.util.AbstractEntity;

@Entity
@Table(name="business")
public class Business extends AbstractEntity {
	
	@NotNull(message="Campo deve ser preenchido") @NotEmpty(message="Campo deve ser preenchido")
	private String name;

	private String cnpj;
	
	private String address;
	
	private String city;
	
	private String uf;
	
	private String phone;
	
	@Lob
	@Column(columnDefinition="mediumblob")
	private byte[] photo;
	
	@Lob
	@Column(columnDefinition="mediumblob")
	private byte[] logo;
	

	@OneToMany(mappedBy="business", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Category> categories;
	
	@OneToMany(mappedBy="business", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Product> products;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
	
	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	

}
