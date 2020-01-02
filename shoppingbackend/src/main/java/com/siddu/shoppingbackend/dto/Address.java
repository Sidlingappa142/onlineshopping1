package com.siddu.shoppingbackend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity

public class Address implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * private fileds
	 * */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	/*............................*/
	
	@ManyToOne
	private User user;
	/*............................*/
	
	
	@Column(name="address_line_one")
	@NotBlank(message="Please enter address")
	private String addressLineOne;
	
	@Column(name="address_line_two")
	@NotBlank(message="Please enter address")
	private String addresLineTwo;
	
	@NotBlank(message="Please enter city")
	private String city;
	
	@NotBlank(message="Please enter state")
	private String state;
	
	@NotBlank(message="Please enter country")
	private String country;
	
	@NotBlank(message="Please enter postal code")
	@Column(name="postal_code")
	private String postalCode;
	
	private boolean shipping;
	private boolean billing;
	
	
	/*
	 * setters and getters for fields
	 * */
	
	
	public int getId() {
		return id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAddressLineOne() {
		return addressLineOne;
	}
	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}
	public String getAddresLineTwo() {
		return addresLineTwo;
	}
	public void setAddresLineTwo(String addresLineTwo) {
		this.addresLineTwo = addresLineTwo;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public boolean isShipping() {
		return shipping;
	}
	public void setShipping(boolean shipping) {
		this.shipping = shipping;
	}
	public boolean isBilling() {
		return billing;
	}
	public void setBilling(boolean billing) {
		this.billing = billing;
	}
	

	/*
	 * toString for logging and debugging activity
	 * */
	@Override
	public String toString() {
		return "Address [id=" + id + ", user=" + user + ", addressLineOne=" + addressLineOne + ", addresLineTwo="
				+ addresLineTwo + ", city=" + city + ", state=" + state + ", country=" + country + ", postalCode="
				+ postalCode + ", shipping=" + shipping + ", billing=" + billing + "]";
	}
	
	
	
	
	
	
}
