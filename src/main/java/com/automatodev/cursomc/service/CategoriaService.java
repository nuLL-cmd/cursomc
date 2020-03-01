package com.automatodev.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.automatodev.cursomc.domain.Categoria;
import com.automatodev.cursomc.repository.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repository;
	
	public Categoria findCategoria(Integer id) {
		Optional<Categoria> objOptional  = repository.findById(id);
		return objOptional.orElse(null);
	}
}
