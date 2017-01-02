package com.Benamar.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Benamar.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>   {
    @Query("select p from Produit p where designation like :x")
	public Page <Produit> cherchePrduits (@Param("x") String mc,Pageable pageable);
}
