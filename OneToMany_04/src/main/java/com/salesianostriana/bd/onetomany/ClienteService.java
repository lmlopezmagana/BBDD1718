package com.salesianostriana.bd.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository repositorio;
	
	public Cliente findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	
	
	public Iterable<Cliente> findAll() {
		return repositorio.findAll();
	}
	
	public Cliente save(Cliente entidad) {
		return repositorio.save(entidad);
	}
	

}
