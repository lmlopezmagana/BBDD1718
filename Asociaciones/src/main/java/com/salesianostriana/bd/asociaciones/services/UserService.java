package com.salesianostriana.bd.asociaciones.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.bd.asociaciones.model.User;
import com.salesianostriana.bd.asociaciones.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repositorio;
	
	public User findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Iterable<User> findAll() {
		return repositorio.findAll();
	}
	
	public User save(User entidad) {
		return repositorio.save(entidad);
	}
	
	

}
