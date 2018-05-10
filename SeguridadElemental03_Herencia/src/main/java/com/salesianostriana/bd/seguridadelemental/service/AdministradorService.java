package com.salesianostriana.bd.seguridadelemental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.bd.seguridadelemental.model.Administrador;
import com.salesianostriana.bd.seguridadelemental.model.UsuarioBasico;
import com.salesianostriana.bd.seguridadelemental.repo.AdministradorRepository;

@Service
public class AdministradorService {
	
	@Autowired
	private AdministradorRepository repositorio;
	
	public Iterable<Administrador> findAll() {
		return repositorio.findAll();
	}
	
	public Administrador findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Administrador save(Administrador u) {
		return repositorio.save(u);
	}
	
	public Administrador edit(Administrador u) {
		return repositorio.save(u);
	}
	
	public Administrador delete(Administrador u) {
		Administrador aBorrar = repositorio.findById(u.getId()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(u);
		
		return aBorrar;
	}
	
	
	
	
	

}
