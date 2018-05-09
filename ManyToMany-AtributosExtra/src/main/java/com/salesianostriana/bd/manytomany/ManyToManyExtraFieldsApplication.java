package com.salesianostriana.bd.manytomany;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManyToManyExtraFieldsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyExtraFieldsApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner testDatabase(PersonaService personaService, DireccionService direccionService) {
		return args -> {
			
			Persona p1 = new Persona("Juan");
			Persona p2 = new Persona("Marta");
			
			Direccion d1 = new Direccion("Ronda de Triana", "7", "41010", "Sevilla");
			Direccion d2 = new Direccion("Paseo Marítimo", "1", "11500", "Valdelagrana, El Puerto de Santa María (Cádiz)");
			
			p1 = personaService.save(p1);
			p2 = personaService.save(p2);
			
			d1 = direccionService.save(d1);
			d2 = direccionService.save(d2);
			
			p1.addDireccion(d1, "Casa");
			p1.addDireccion(d2, "Playa");
			
			p2.addDireccion(d2, "Verano");
			
			p1 = personaService.save(p1);
			p2 = personaService.save(p2);
			
			System.out.println(p1);
			System.out.println(d2);
			
			p2 = personaService.findOne(p2.getId());
			
			System.out.println(p2);
			
			
		};
	}
}
