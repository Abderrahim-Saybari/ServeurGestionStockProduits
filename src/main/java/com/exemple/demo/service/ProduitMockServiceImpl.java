package com.exemple.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.exemple.demo.entity.Produit;

@Service
public class ProduitMockServiceImpl implements IProduitService {

    private List<Produit> produits;
    
	public ProduitMockServiceImpl() {
	 produits = new ArrayList<>();
	 produits.add(new Produit("Livre",50,20));
	 produits.add(new Produit("Cahier",10,5));
	 produits.add(new Produit("Stylo",30,3));
		
	}
	
	@Override
	public List<Produit> getProduits() {
		return produits;
	}

	@Override
	public void addProduit(Produit prd) {
		produits.add(prd);
	}

	@Override
	public void updateProduit(Produit prd) {
		produits.remove(prd);
		produits.add(prd);
	}

	@Override
	public void deleteProduit(String ref) {
		String reff = "";
		for (int i = 0; i < produits.size(); i++) {
			reff = produits.get(i).getRef();
			if(reff.equals(ref)) {
				produits.remove(produits.get(i));
				break;
			}
		}
	}

}
