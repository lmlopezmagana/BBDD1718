package com.salesianostriana.bd.servicioabstracto.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.bd.servicioabstracto.modelo.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
