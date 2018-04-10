package dao;

import java.util.List;

import modelo.Producto;

public interface DaoProducto {
	
	public Producto create(Producto p);
	public Producto update(Producto p);
	public Producto delete(Producto p);
	public List<Producto> findAll();
	public Producto findOne(long cup);
	

}
