package com.marwa.produits.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.marwa.produits.entites.Categorie;
import com.marwa.produits.entites.Produit;

@RepositoryRestResource(path = "rest")
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}

