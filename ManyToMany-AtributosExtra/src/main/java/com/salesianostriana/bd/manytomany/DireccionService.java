package com.salesianostriana.bd.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionService {
	
	@Autowired
	DireccionRepository repositorio;
	
	public Direccion findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Iterable<Direccion> findAll() {
		return repositorio.findAll();
	}
	
	public Direccion save(Direccion entidad) {
		return repositorio.save(entidad);
	}

}
