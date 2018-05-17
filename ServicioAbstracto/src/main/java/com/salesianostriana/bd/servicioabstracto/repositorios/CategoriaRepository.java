package com.salesianostriana.bd.servicioabstracto.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.bd.servicioabstracto.modelo.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
