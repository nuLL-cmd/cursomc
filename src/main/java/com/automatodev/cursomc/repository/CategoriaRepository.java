package com.automatodev.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.automatodev.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
}

