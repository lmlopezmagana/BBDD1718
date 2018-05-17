package com.salesianostriana.bd.servicioabstracto.servicios;

import org.springframework.stereotype.Service;

import com.salesianostriana.bd.servicioabstracto.modelo.Categoria;
import com.salesianostriana.bd.servicioabstracto.repositorios.CategoriaRepository;

@Service
public class CategoriaServicio extends AbstractService<Categoria, Long, CategoriaRepository> {

}
