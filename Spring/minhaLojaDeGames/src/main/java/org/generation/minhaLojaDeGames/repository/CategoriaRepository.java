package org.generation.minhaLojaDeGames.repository;

import java.util.List;

import org.generation.minhaLojaDeGames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>
{	
	public List<Categoria> findAllBynomeCategoriaContainingIgnoreCase (String nomeCategoria);	
	
}
