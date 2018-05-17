package com.salesianostriana.bd.consultas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.salesianostriana.bd.consultas.modelo.Categoria;
import com.salesianostriana.bd.consultas.modelo.Producto;
import com.salesianostriana.bd.consultas.servicios.CategoriaServicio;
import com.salesianostriana.bd.consultas.servicios.ProductoServicio;

@SpringBootApplication
public class ConsultasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsultasApplication.class, args);
	}

	@Bean
	public CommandLineRunner testDatabase(CategoriaServicio categoriaServicio, ProductoServicio productoServicio) {
		return args -> {

			Categoria memorias = categoriaServicio.primeraCategoriaLike("ram");			
			System.out.println(memorias.getNombre());
			
			for(Producto p : productoServicio.cincoPrimerosPorNombre()) {
				System.out.println(p.getNombre());
			}

			for(Producto p : productoServicio.cincoPrimerosPorPrecioDesc()) {
				System.out.println(p.getNombre());
			}

			
		};
	}
}
