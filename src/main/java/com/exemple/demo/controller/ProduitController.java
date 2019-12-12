package com.exemple.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.demo.entity.Produit;
import com.exemple.demo.service.ProduitMockServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/produit")
public class ProduitController {
	
	@Autowired
	private ProduitMockServiceImpl produitImpl;
	
	@GetMapping
	public List<Produit> getProduits(){
		return produitImpl.getProduits();
	}
	
	@PostMapping
	public void addProduit(@RequestBody Produit prd){
		 produitImpl.addProduit(prd);
	}
	
	@PutMapping
	public void update(@RequestBody Produit prd) {
		produitImpl.updateProduit(prd);
	}
	
	@DeleteMapping("/{ref}")
	public void deleteProduit(@PathVariable String ref) {
		produitImpl.deleteProduit(ref);
	}

}
