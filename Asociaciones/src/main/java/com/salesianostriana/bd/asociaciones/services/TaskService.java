package com.salesianostriana.bd.asociaciones.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.bd.asociaciones.model.Task;
import com.salesianostriana.bd.asociaciones.repo.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	TaskRepository repositorio;
	
	public Task findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Iterable<Task> findAll() {
		return repositorio.findAll();
	}
	
	public Task save(Task entidad) {
		return repositorio.save(entidad);
	}
	

}
