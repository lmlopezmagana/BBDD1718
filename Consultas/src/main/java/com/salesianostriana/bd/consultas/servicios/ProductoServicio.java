package com.salesianostriana.bd.consultas.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.salesianostriana.bd.consultas.modelo.Categoria;
import com.salesianostriana.bd.consultas.modelo.Producto;
import com.salesianostriana.bd.consultas.repositorios.ProductoRepository;

@Service
public class ProductoServicio  {
	
	@Autowired
	ProductoRepository repositorio;
	
	public Producto save(Producto p) {
		return repositorio.save(p);
	}
	
	public Producto edit(Producto p) {
		return repositorio.save(p);
	}
	
	public Producto findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Iterable<Producto> findAll() {
		return repositorio.findAll();
	}
	
	public Producto delete(Producto p) {
		Producto aBorrar = repositorio.findById(p.getId()).orElse(null);
		if (aBorrar != null) {
			repositorio.delete(p);
		}
		return aBorrar;
	}
	
	// Consultas
	
	public Iterable<Producto> porCategoria(Categoria categoria) { 
		return repositorio.findByCategoria(categoria);
	}
	
	public Iterable<Producto> porCategoria(String categoria) { 
		return repositorio.findByCategoriaNombre(categoria);
	}
	
	public List<Producto> cincoPrimerosPorNombre() {
		return repositorio.findTop5By(Sort.by("nombre").ascending());
	}
	
	public List<Producto> cincoPrimerosPorPrecioDesc() {
		return repositorio.findTop5By(Sort.by("pvp").descending());
	}
		

	

}
