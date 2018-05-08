package com.salesianostriana.bd.onetomany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FacturaRepository extends JpaRepository<Factura, Long>{
		
	@Query("select f From Factura f where f.cliente = ?1")
	Iterable<Factura> obtenerFacturasDeUnCliente(Cliente c);
	
}
