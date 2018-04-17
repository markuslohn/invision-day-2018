package com.esentri.office;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Contact
 *
 */
@Entity
public class Contact implements Serializable {

    @Id
    private Integer id;
    private String prename;
    private String lastname;
    private Date birthdate;
    private String street;
    private String postalcode;
    private String city;
    private String phone;
    private String mobil;
    private String mail;
    private static final long serialVersionUID = 1L;

    public Contact() {
	super();
    }

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getPrename() {
	return this.prename;
    }

    public void setPrename(String prename) {
	this.prename = prename;
    }

    public String getLastname() {
	return this.lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    public Date getBirthdate() {
	return this.birthdate;
    }

    public void setBirthdate(Date birthdate) {
	this.birthdate = birthdate;
    }

    public String getStreet() {
	return this.street;
    }

    public void setStreet(String street) {
	this.street = street;
    }

    public String getPostalcode() {
	return this.postalcode;
    }

    public void setPostalcode(String postalcode) {
	this.postalcode = postalcode;
    }

    public String getCity() {
	return this.city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getPhone() {
	return this.phone;
    }

    public void setPhone(String phone) {
	this.phone = phone;
    }

    public String getMobil() {
	return this.mobil;
    }

    public void setMobil(String mobil) {
	this.mobil = mobil;
    }

    public String getMail() {
	return this.mail;
    }

    public void setMail(String mail) {
	this.mail = mail;
    }

}
