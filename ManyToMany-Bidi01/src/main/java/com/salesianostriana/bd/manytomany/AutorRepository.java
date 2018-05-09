package com.salesianostriana.bd.manytomany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface AutorRepository extends JpaRepository<Autor, Long>{
	
	@Query("select distinct a from Autor a join fetch a.libros where a = ?1")
	Autor encuentraAutorConLibros(Autor a);

}
