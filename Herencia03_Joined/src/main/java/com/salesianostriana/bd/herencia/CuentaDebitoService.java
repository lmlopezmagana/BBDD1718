package com.salesianostriana.bd.herencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CuentaDebitoService {
	
	@Autowired
	private CuentaDebitoRepository repositorio;
	
	
	public Iterable<CuentaDebito> findAll() {
		return repositorio.findAll();
	}
	
	public CuentaDebito findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public CuentaDebito save(CuentaDebito u) {
		return repositorio.save(u);
	}
	
	public CuentaDebito edit(CuentaDebito u) {
		return repositorio.save(u);
	}
	
	public CuentaDebito delete(CuentaDebito u) {
		CuentaDebito aBorrar = repositorio.findById(u.getId()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(u);
		
		return aBorrar;
	}

}
