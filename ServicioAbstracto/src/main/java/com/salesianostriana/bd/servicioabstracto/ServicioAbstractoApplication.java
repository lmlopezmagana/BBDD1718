package com.salesianostriana.bd.servicioabstracto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.salesianostriana.bd.servicioabstracto.modelo.Categoria;
import com.salesianostriana.bd.servicioabstracto.modelo.Producto;
import com.salesianostriana.bd.servicioabstracto.servicios.CategoriaServicio;
import com.salesianostriana.bd.servicioabstracto.servicios.ProductoServicio;

@SpringBootApplication
public class ServicioAbstractoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioAbstractoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner testDatabase(CategoriaServicio categoriaServicio, ProductoServicio productoServicio) {
		return args -> {
			
			Categoria categoria = new Categoria("Portátiles");
			categoriaServicio.save(categoria);
			
			Producto p1 = new Producto("Macbook Pro", 1500.0f, 0.05f, categoria);
			Producto p2 = new Producto("Dell Xps 13\"", 1300.0f, 0.0f, categoria);
			Producto p3 = new Producto("MSI", 1100.0f, 0.0f, categoria);
			
			productoServicio.save(p1);
			productoServicio.save(p2);
			productoServicio.save(p3);
			
			
			
		};
	}
}
