package com.Benamar.entities;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.validation.annotation.Validated;

@Entity
public class Categorie implements Serializable {
	
	@Id @GeneratedValue
	private Long id;
	private String nom;
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Categorie(String nom) {
		super();
		this.nom = nom;
	}

	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
