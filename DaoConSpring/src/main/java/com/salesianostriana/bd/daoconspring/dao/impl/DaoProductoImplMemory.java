package com.salesianostriana.bd.daoconspring.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.salesianostriana.bd.daoconspring.dao.DaoProducto;
import com.salesianostriana.bd.daoconspring.modelo.Producto;


//@Component
@Repository
public class DaoProductoImplMemory implements DaoProducto{

	List<Producto> productos = new ArrayList<Producto>();
	
	public Producto create(Producto p) {
		productos.add(p);
		return p;
	}

	public Producto update(Producto p) {
	Producto aModificar = findOne(p.getCup());
		if (aModificar != null)
			delete(aModificar);
		return create(p);
	}

	public Producto delete(Producto p) {
		productos.remove(p);
		return p;
	}

	public List<Producto> findAll() {
		return productos;
	}

	public Producto findOne(long cup) {
		return productos
				.stream()
				.filter(p -> p.getCup() == cup)
				.findFirst()
				.orElse(null);				
	}

	

}
