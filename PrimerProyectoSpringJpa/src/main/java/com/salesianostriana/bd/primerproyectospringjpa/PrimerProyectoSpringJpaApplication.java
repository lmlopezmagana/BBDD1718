package com.salesianostriana.bd.primerproyectospringjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrimerProyectoSpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerProyectoSpringJpaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner testDatabase(EntidadService servicio) {
		return args -> {
			
			Entidad e = new Entidad();
			//e.setTexto("Hola mundo");
			
			Entidad e2 = servicio.save(e);
			
			System.out.println(e2);
			
			
		};
	}
}
