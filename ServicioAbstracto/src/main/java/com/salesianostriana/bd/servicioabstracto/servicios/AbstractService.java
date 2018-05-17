package com.salesianostriana.bd.servicioabstracto.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.bd.servicioabstracto.modelo.Identificable;

public abstract class AbstractService<T extends Identificable<ID>, ID, R extends JpaRepository<T, ID>> {
	
	@Autowired
	R repositorio;
	
	public T save(T t) {
		return repositorio.save(t);
	}
	
	public T findById(ID id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Iterable<T> findAll() {
		return repositorio.findAll();
	}
	
	public T edit(T t) {
		return repositorio.save(t);
	}
	
	public T delete(T t) {
		T aBorrar = repositorio.findById(t.getId()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(aBorrar);
		return aBorrar;
	}
	
	

}
