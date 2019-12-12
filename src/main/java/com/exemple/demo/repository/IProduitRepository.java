package com.exemple.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemple.demo.entity.Produit;

@Repository
public interface IProduitRepository extends JpaRepository<Produit, Long> {

}
