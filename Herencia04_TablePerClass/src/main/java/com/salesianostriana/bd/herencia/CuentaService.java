package com.salesianostriana.bd.herencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CuentaService {
	
	@Autowired
	private CuentaRepository repositorio;
	
	
	public Iterable<Cuenta> findAll() {
		return repositorio.findAll();
	}
	
	public Cuenta findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Cuenta save(Cuenta u) {
		return repositorio.save(u);
	}
	
	public Cuenta edit(Cuenta u) {
		return repositorio.save(u);
	}
	
	public Cuenta delete(Cuenta u) {
		Cuenta aBorrar = repositorio.findById(u.getId()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(u);
		
		return aBorrar;
	}

}
