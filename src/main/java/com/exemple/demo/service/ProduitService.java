package com.exemple.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.exemple.demo.entity.Produit;
import com.exemple.demo.repository.IProduitRepository;

@Service
@Primary
public class ProduitService implements IProduitService {
	
	@Autowired
	private IProduitRepository produitRepositoy;

	@Override
	public List<Produit> getProduits() {
		return produitRepositoy.findAll();
	}

	@Override
	public void addProduit(Produit prd) {
		produitRepositoy.save(prd);
	}

	@Override
	public void updateProduit(Produit prd) {
		produitRepositoy.save(prd);
	}

	@Override
	public void deleteProduit(Long id) {
		produitRepositoy.deleteById(id);
	}



}
