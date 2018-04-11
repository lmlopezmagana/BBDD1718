package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.DaoProducto;
import modelo.Producto;

public class DaoProductoImplMemory implements DaoProducto{

	List<Producto> productos = new ArrayList<Producto>();
		
	@Override
	public Producto create(Producto p) {
		productos.add(p);
		return p;
	}

	@Override
	public Producto update(Producto p) {
	Producto aModificar = findOne(p.getCup());
		if (aModificar != null)
			delete(aModificar);
		return create(p);
	}

	@Override
	public Producto delete(Producto p) {
		productos.remove(p);
		return p;
	}

	@Override
	public List<Producto> findAll() {
		return productos;
	}

	@Override
	public Producto findOne(long cup) {
		return productos
				.stream()
				.filter(p -> p.getCup() == cup)
				.findFirst()
				.orElse(null);				
	}

}
