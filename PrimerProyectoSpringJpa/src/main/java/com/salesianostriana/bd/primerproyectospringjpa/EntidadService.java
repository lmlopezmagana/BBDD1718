package com.salesianostriana.bd.primerproyectospringjpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntidadService {
	
	@Autowired
	EntidadRepository repositorio;
	
	public Entidad findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Iterable<Entidad> findAll() {
		return repositorio.findAll();
	}
	
	public Entidad save(Entidad entidad) {
		return repositorio.save(entidad);
	}

}
