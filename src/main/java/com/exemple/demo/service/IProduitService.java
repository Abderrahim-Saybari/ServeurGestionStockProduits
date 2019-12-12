package com.exemple.demo.service;

import java.util.List;

import com.exemple.demo.entity.Produit;

public interface IProduitService {
	
	List<Produit> getProduits();
	
	void addProduit(Produit prd);
	
	void updateProduit(Produit prd);
	
	void deleteProduit(String ref);

}
