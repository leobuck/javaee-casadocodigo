package br.com.casadocodigo.loja.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import br.com.casadocodigo.loja.models.validation.groups.BuyerGroup;

@SuppressWarnings("deprecation")
@Entity
public class SystemUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Email
	@NotBlank
	@Column(unique = true)
	private String email;
	@NotBlank(groups = BuyerGroup.class)
	private String firstName;
	@NotBlank(groups = BuyerGroup.class)
	private String lastName;
	@NotBlank(groups = BuyerGroup.class)
	@Column(unique = true)
	private String socialId;
	@NotBlank(groups = BuyerGroup.class)
	private String address;
	@NotBlank(groups = BuyerGroup.class)
	private String city;
	@NotBlank(groups = BuyerGroup.class)
	private String state;
	@NotBlank(groups = BuyerGroup.class)
	private String postalCode;
	@NotBlank(groups = BuyerGroup.class)
	private String phone;
	@NotBlank(groups = BuyerGroup.class)
	private String country;
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialId() {
		return socialId;
	}

	public void setSocialId(String socialId) {
		this.socialId = socialId;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
