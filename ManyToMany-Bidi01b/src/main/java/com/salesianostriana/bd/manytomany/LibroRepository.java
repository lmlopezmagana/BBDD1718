package com.salesianostriana.bd.manytomany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LibroRepository extends JpaRepository<Libro, Long>{
	
	
	@Query("select distinct l from Libro l join fetch l.autores where l = ?1")
	Libro encuentraLibroConAutores(Libro l);
	

}
