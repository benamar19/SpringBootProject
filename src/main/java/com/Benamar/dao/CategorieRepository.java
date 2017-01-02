package com.Benamar.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Benamar.entities.Categorie;
import com.Benamar.entities.Produit;

@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

	


}
