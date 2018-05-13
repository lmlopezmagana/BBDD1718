package com.salesianostriana.bd.asociaciones;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Autowired
	private EspecificacionDeProductoRepository especificacionDeProductoRepository;
	
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}
	
	@Transactional
	public Producto save(Producto producto, EspecificacionDeProducto especificacionDeProducto) {
		Producto result = productoRepository.save(producto);
		especificacionDeProducto.setProducto(producto);
		especificacionDeProductoRepository.save(especificacionDeProducto);
		return result;
	}
	
	public EspecificacionDeProducto save(EspecificacionDeProducto especificacionDeProducto) {
		return especificacionDeProductoRepository.save(especificacionDeProducto);
	}
	
	
	public Iterable<Producto> findAll() {
		return productoRepository.findAll();
	}
	
	public Producto findOne(Long id) {
		return productoRepository.findById(id).orElse(null);
	}
	
	public EspecificacionDeProducto findOne(Producto producto) {
		return especificacionDeProductoRepository.findById(producto.getId()).orElse(null); 
	}
	
	
	
}
