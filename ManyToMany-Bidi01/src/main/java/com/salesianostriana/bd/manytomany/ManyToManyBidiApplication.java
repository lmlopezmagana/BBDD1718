package com.salesianostriana.bd.manytomany;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManyToManyBidiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyBidiApplication.class, args);
	}
	
	/*
	 * Este caso sería el de una asociación Muchos-A-Muchos bidireccional.
	 * En la entidad libro, guardamos una asociación con los autores del mismo.
	 * En la entidad autor, guardamos una lista con los libros que ha escrito.
	 * 
	 * 
	 */
	
	@Bean
	public CommandLineRunner testDatabase(AutorService autorService, LibroService libroService) {
		return args -> {
			
			Libro libro1 = new Libro("Aprenda Spring como si estuviera en 1º DAM");
			libro1 = libroService.save(libro1);
			
			
			Autor autor1 = new Autor("Luismi");
			autor1.getLibros().add(libro1);
			Autor autor2 = new Autor("Ángel");
			autor2.getLibros().add(libro1);

			autor1 = autorService.save(autor1);
			autor2 = autorService.save(autor2);
			
			
			libro1.getAutores().add(autor1);
			libro1.getAutores().add(autor2);
			
			libro1 = libroService.save(libro1);
			
			libro1 = libroService.findOneConAutores(libro1);
			
			System.out.println(libro1);
			
			Libro libro2 = new Libro("El final del curso está a la vuelta de la esquina");
			libro2.getAutores().add(autor2);	
			libro2 = libroService.save(libro2);
			autor2.getLibros().add(libro2);
			autor2 = autorService.save(autor2);
			
			Libro libro3 = new Libro("¿Quieres aprender SQL? Depende");
			libro3.getAutores().add(autor1);
			libro3 = libroService.save(libro3);
			autor1.getLibros().add(libro3);
			autor1 = autorService.save(autor1);
			
			autor1 = autorService.findOneConLibros(autor1);
			
			//Libros del autor1
			for(Libro l : autor1.getLibros()) {
				System.out.println(l.getTitulo());
			}
			
			/*
			 * Se hace palpable la necesidad de los métodos helper
			 */
			
			
		};
	}
}
