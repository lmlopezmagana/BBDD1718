package com.salesianostriana.bd.todo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.bd.todo.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
