package com.exemple.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServeurGestionStockProduitsApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);
//		ConfigurableApplicationContext ctx = SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);

		/** pour l'initialisation c'est tout */
//		IProduitRepository produitRepository = ctx.getBean(IProduitRepository.class);
//		
//		produitRepository.save(new Produit("Livre",50,20));
//		produitRepository.save(new Produit("Cahier",10,5));
//		produitRepository.save(new Produit("Stylo",30,3));

	}

}
