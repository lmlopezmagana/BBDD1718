package com.salesianostriana.bd.consultas.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.bd.consultas.modelo.Categoria;
import com.salesianostriana.bd.consultas.repositorios.CategoriaRepository;

@Service
public class CategoriaServicio {

	@Autowired
	CategoriaRepository repositorio;

	public Categoria save(Categoria c) {
		return repositorio.save(c);
	}

	public Categoria edit(Categoria c) {
		return repositorio.save(c);
	}

	public Categoria findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}

	public Iterable<Categoria> findAll() {
		return repositorio.findAll();
	}

	public Categoria delete(Categoria c) {
		Categoria aBorrar = repositorio.findById(c.getId()).orElse(null);
		if (aBorrar != null) {
			repositorio.delete(c);
		}
		return aBorrar;
	}

	// Consultas

	public List<String> todas() {
		return repositorio.findAllCategories();
	}

	// Obtener las 5 primeras categorías ordenadas alfabéticamente por el nombre
	public List<Categoria> primerasPorNombre() {
		return repositorio.findFirst5ByOrderByNombreAsc();
	}

	// Obtener una categoría cuyo nombre contenga una cadena de caracteres
	public Categoria primeraCategoriaLike(String nombre) {
		return repositorio.findFirstByNombreContainingIgnoreCase(nombre);
	}

}
