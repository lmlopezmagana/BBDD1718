package com.salesianostriana.bd.daoconspring.dao;

import java.util.List;

import com.salesianostriana.bd.daoconspring.modelo.Producto;

public interface DaoProducto {
	
	public Producto create(Producto p);
	public Producto update(Producto p);
	public Producto delete(Producto p);
	public List<Producto> findAll();
	public Producto findOne(long cup);
	

}
