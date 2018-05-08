package com.salesianostriana.bd.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService {
	
	@Autowired
	FacturaRepository repositorio;
	
	public Factura findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Iterable<Factura> findAll() {
		return repositorio.findAll();
	}
	
	public Factura save(Factura entidad) {
		return repositorio.save(entidad);
	}
	
	public Iterable<Factura> deCliente(Cliente c) {
		return repositorio.obtenerFacturasDeUnCliente(c);
	}
	

}
