package com.salesianostriana.bd.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LibroService {
	
	@Autowired
	LibroRepository repositorio;
	
	public Libro findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Iterable<Libro> findAll() {
		return repositorio.findAll();
	}
	
	public Libro save(Libro entidad) {
		return repositorio.save(entidad);
	}
	
	public Iterable<Libro> deAutor(Autor a) {
		return repositorio.librosDeUnAutor(a);
	}

}
