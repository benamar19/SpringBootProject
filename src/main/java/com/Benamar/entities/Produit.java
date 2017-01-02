package com.Benamar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produit {
@Id @GeneratedValue
private Long id;
private String designation;
private int quantite;
private Double prix;



public Produit() {
	super();
	
}
public Produit(String designation, int quantite, Double prix) {
	super();
	this.designation = designation;
	this.quantite = quantite;
	this.prix = prix;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public Double getPrix() {
	return prix;
}
public void setPrix(Double prix) {
	this.prix = prix;
}

}
