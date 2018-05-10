package com.salesianostriana.bd.seguridadelemental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.bd.seguridadelemental.model.UsuarioBasico;
import com.salesianostriana.bd.seguridadelemental.repo.UsuarioBasicoRepository;

@Service
public class UsuarioBasicoService {
	
	@Autowired
	private UsuarioBasicoRepository repositorio;
	
	public Iterable<UsuarioBasico> findAll() {
		return repositorio.findAll();
	}
	
	public UsuarioBasico findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public UsuarioBasico save(UsuarioBasico u) {
		return repositorio.save(u);
	}
	
	public UsuarioBasico edit(UsuarioBasico u) {
		return repositorio.save(u);
	}
	
	public UsuarioBasico delete(UsuarioBasico u) {
		UsuarioBasico aBorrar = repositorio.findById(u.getId()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(u);
		
		return aBorrar;
	}
	
	
	
	
	

}
