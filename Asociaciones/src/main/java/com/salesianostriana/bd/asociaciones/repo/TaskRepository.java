package com.salesianostriana.bd.asociaciones.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.bd.asociaciones.model.Task;


public interface TaskRepository extends JpaRepository<Task, Long>{

}
