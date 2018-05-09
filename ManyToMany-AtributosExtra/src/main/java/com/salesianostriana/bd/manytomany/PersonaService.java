package com.salesianostriana.bd.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
	
	@Autowired
	PersonaRepository repositorio;
	
	public Persona findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Iterable<Persona> findAll() {
		return repositorio.findAll();
	}
	
	public Persona save(Persona entidad) {
		return repositorio.save(entidad);
	}

}
