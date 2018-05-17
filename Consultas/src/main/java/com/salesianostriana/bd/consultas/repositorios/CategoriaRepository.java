package com.salesianostriana.bd.consultas.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.salesianostriana.bd.consultas.modelo.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	// Obtener todos los nombres de categorías en una lista de String
	@Query("select c.nombre from Categoria c")
	List<String> findAllCategories();
	
	// Obtener todas las categorias que contengan una parte del nombre
	@Query("select c from Categoria c where c.nombre LIKE ?1")
	List<Categoria> encuentraCategoriaPorNombre(String nombre);

	@Query("select c from Categoria c where c.nombre LIKE :nombre")
	List<Categoria> encuentraCategoriaPorNombrev2(@Param("nombre") String nombre);

	
	// Obtener las 5 primeras categorías ordenadas alfabéticamente por el nombre
	List<Categoria> findFirst5ByOrderByNombreAsc();
	
	List<Categoria> findByOrderByNombreAsc();
	
	// Obtener una categoría cuyo nombre contenga una cadena de caracteres
	Categoria findFirstByNombreContainingIgnoreCase(String nombre);

}
