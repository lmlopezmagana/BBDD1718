package com.salesianostriana.bd.herencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CuentaCreditoService {
	
	@Autowired
	private CuentaCreditoRepository repositorio;
	
	
	public Iterable<CuentaCredito> findAll() {
		return repositorio.findAll();
	}
	
	public CuentaCredito findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public CuentaCredito save(CuentaCredito u) {
		return repositorio.save(u);
	}
	
	public CuentaCredito edit(CuentaCredito u) {
		return repositorio.save(u);
	}
	
	public CuentaCredito delete(CuentaCredito u) {
		CuentaCredito aBorrar = repositorio.findById(u.getId()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(u);
		
		return aBorrar;
	}

}
