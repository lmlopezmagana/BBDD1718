package com.salesianostriana.bd.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.bd.todo.model.Todo;
import com.salesianostriana.bd.todo.repo.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository repo;
	
	
	public Todo create(Todo t) {
		return repo.save(t);
	}
	
	
	public List<Todo> findAll() {
		return repo.findAll();
	}
	
	public Todo findOne(Long id) {
		Todo result = repo.findById(id).orElse(null);
		return result;
	}

}
