package com.salesianostriana.bd.consultas.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.bd.consultas.modelo.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	// Obtener todos los nombres de categorías en una lista de String
	@Query("select c.nombre from Categoria c")
	List<String> findAllCategories();
	
	// Obtener las 5 primeras categorías ordenadas alfabéticamente por el nombre
	List<Categoria> findFirst5ByOrderByNombreAsc();
	
	// Obtener una categoría cuyo nombre contenga una cadena de caracteres
	Categoria findFirstByNombreContainingIgnoreCase(String nombre);

}
