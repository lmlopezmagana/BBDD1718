package com.salesianostriana.bd.onetomany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	@Query("select distinct c from Cliente c join fetch c.facturas where c.id = ?1")
	//Iterable<Cliente> encuentraClienteConFacturas(Long id);
	Cliente encuentraClienteConFacturas(Long id);

}
