package com.salesianostriana.bd.servicioabstracto.servicios;

import org.springframework.stereotype.Service;

import com.salesianostriana.bd.servicioabstracto.modelo.Producto;
import com.salesianostriana.bd.servicioabstracto.repositorios.ProductoRepository;

@Service
public class ProductoServicio extends AbstractService<Producto, Long, ProductoRepository> {
	

}
