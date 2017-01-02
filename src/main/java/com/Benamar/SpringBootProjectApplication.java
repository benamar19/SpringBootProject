package com.Benamar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Benamar.dao.ProduitRepository;
import com.Benamar.entities.Produit;

@SpringBootApplication
public class SpringBootProjectApplication implements CommandLineRunner 
	

{
	@Autowired
	private ProduitRepository produitRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
		/*ApplicationContext app=
		SpringApplication.run(SpringBootProjectApplication.class, args);
		ProduitRepository produitRepository= app.getBean(ProduitRepository.class);
		produitRepository.save(new Produit("HP",10,1000.0));
		produitRepository.save(new Produit("DELL",20,2000.0));
		produitRepository.save(new Produit("Samsung",30,3000.0));
		
		List <Produit> prods =produitRepository.findAll();
		prods.forEach(p->System.out.println(p.getDesignation()));*/
	}

	@Override
	public void run(String... arg0) throws Exception {
		       /*  this 3 lines to fill the database first after start the app
		        produitRepository.save(new Produit("HP",10,1000.0));
				produitRepository.save(new Produit("DELL",20,2000.0));
				produitRepository.save(new Produit("Samsung",30,3000.0));*/
				
				List <Produit> prods =produitRepository.findAll();
				prods.forEach(p->System.out.println(p.getDesignation()));
		
	}
}
