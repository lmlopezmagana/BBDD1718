package com.salesianostriana.bd.seguridadelemental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.bd.seguridadelemental.model.Usuario;
import com.salesianostriana.bd.seguridadelemental.repo.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repositorio;
	
	public Usuario login(String username, String pass) {
		return repositorio.findFirstByUsernameAndPass(username, pass);
	}
	
	public Iterable<Usuario> findAll() {
		return repositorio.findAll();
	}
	
	public Usuario findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Usuario save(Usuario u) {
		return repositorio.save(u);
	}
	
	public Usuario edit(Usuario u) {
		return repositorio.save(u);
	}
	
	public Usuario delete(Usuario u) {
		Usuario aBorrar = repositorio.findById(u.getId()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(u);
		
		return aBorrar;
	}
	
	
	
	

}
