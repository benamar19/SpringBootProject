package com.Benamar.dao;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Benamar.entities.Produit;

@RestController
public class ProduitRest {

	@Autowired
	private ProduitRepository produitRepository;
	/*@RequestMapping(value="/produits",method=RequestMethod.GET)
	public List <Produit> afficher(){
		return produitRepository.findAll();
		
	}*/
	
	// pour afficher page par page 
	//si on veut tout afficher on met code en comments en haut
	@RequestMapping(value="/produits",method=RequestMethod.GET)
	public Page <Produit> afficher(int page,int size){
		return produitRepository.findAll(new PageRequest(page, size));
		
	}
	
	@RequestMapping(value="/cherche", method=RequestMethod.GET)
	public Page <Produit> cherche (
			String mc,
			@RequestParam (defaultValue="0") int page,
			@RequestParam (defaultValue="5") int size)
	{
		return produitRepository.cherchePrduits("%"+mc+"%", new PageRequest(page,size));
	}
	
	@RequestMapping(value="/produits/{id}")
	public Produit affiche1( @PathVariable Long id)
	{
		
		return produitRepository.findOne(id);
	}
	
	@RequestMapping(value="/produits",method=RequestMethod.POST)
	public void save(@RequestBody Produit p)
	{
		produitRepository.save(p);
	}
	@RequestMapping(value="/produits/{id}",method=RequestMethod.PUT)
	public void update(@RequestBody Produit p,@PathVariable Long id)
	{
		p.setId(id);
		produitRepository.saveAndFlush(p);
	}
	@RequestMapping(value="/produits/{id}",method=RequestMethod.DELETE)
	public void delete (@PathVariable Long id)
	{
		produitRepository.delete(id);
	}
}
