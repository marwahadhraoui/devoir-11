package com.marwa.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marwa.produits.entites.Categorie;

import com.marwa.produits.repos.CategorieRepository;

@Service
public class CategorieServiceImpl implements CategorieService {
	@Autowired
	CategorieRepository categorieRepository;

	
	
	@Override
	public List<Categorie> getAllCategories() {
		return categorieRepository.findAll();
	}

}
