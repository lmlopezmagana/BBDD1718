package com.salesianostriana.bd.consultas.repositorios;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.bd.consultas.modelo.Categoria;
import com.salesianostriana.bd.consultas.modelo.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
	
	// Obtener todos los productos de una determinada categoria
	Iterable<Producto> findByCategoria(Categoria categoria);
	// Obtener todos los productos de una determinada categoría, proporcionando
	// solamente el nombre de la misma
	Iterable<Producto> findByCategoriaNombre(String nombre);
	// Obtener los 5 primeros productos, segun un orden proporcionado
	List<Producto> findTop5By(Sort sort);

}
