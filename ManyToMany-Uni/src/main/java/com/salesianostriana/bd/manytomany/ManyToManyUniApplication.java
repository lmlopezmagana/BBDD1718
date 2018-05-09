package com.salesianostriana.bd.manytomany;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManyToManyUniApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyUniApplication.class, args);
	}
	
	/*
	 * Este caso sería el de una asociación Muchos-A-Muchos unidireccional.
	 * En la entidad libro, guardamos una asociación con los autores del mismo.
	 * 
	 * Si queremos saber los libros de un autor, tenemos que hacer una consulta.
	 * 
	 */
	
	@Bean
	public CommandLineRunner testDatabase(AutorService autorService, LibroService libroService) {
		return args -> {
			
			Libro libro1 = new Libro("Aprenda Spring como si estuviera en 1º DAM");
			
			
			Autor autor1 = new Autor("Luismi");
			Autor autor2 = new Autor("Ángel");
			
			autor1 = autorService.save(autor1);
			autor2 = autorService.save(autor2);
			
			System.out.println(autor1);
			System.out.println(autor2);
			
			
			libro1.getAutores().add(autor1);
			libro1.getAutores().add(autor2);
			
			libro1 = libroService.save(libro1);
			
			System.out.println(libro1);
			
			Libro libro2 = new Libro("El final del curso está a la vuelta de la esquina");
			libro2.getAutores().add(autor2);
			
			libro2 = libroService.save(libro2);
			
			Libro libro3 = new Libro("¿Quieres aprender SQL? Depende");
			libro3.getAutores().add(autor1);
			
			libro3 = libroService.save(libro3);
			
			
			Iterable<Libro> librosDeAutor1 = libroService.deAutor(autor1);
			for(Libro l : librosDeAutor1) {
				System.out.println(l.getTitulo());
			}
			
			
		};
	}
}
