package com.salesianostriana.bd.manytomany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LibroRepository extends JpaRepository<Libro, Long>{
	
	@Query("select distinct l from Libro l join l.autores where ?1 MEMBER OF l.autores ")
	Iterable<Libro> librosDeUnAutor(Autor a);

}
