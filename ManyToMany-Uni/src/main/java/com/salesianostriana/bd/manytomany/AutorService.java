package com.salesianostriana.bd.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AutorService {
	
	@Autowired
	AutorRepository repositorio;
	
	public Autor findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Iterable<Autor> findAll() {
		return repositorio.findAll();
	}
	
	public Autor save(Autor entidad) {
		return repositorio.save(entidad);
	}

}
