package com.salesianostriana.bd.onetomany;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToMany02Application {

	public static void main(String[] args) {
		SpringApplication.run(OneToMany02Application.class, args);
	}
	
	/*
	 * En este ejemplo, la asociación será BIDIRECCIONAL, usando
	 * la anotación @ManyToOne y @OneToMany. Sin embargo, NO USAREMOS
	 * la carga ansiosa (fetch de tipo EAGER), sino que SÍ USAREMOS
	 * una consulta con JOIN FETCH.
	 *  	
	 * 
	 */
	
	@Bean
	public CommandLineRunner testDatabase(ClienteService clienteService, FacturaService facturaService) {
		return args -> {
			
			Cliente c = new Cliente("Luismi", "luismi.lopez@salesianos.edu");
			c = clienteService.save(c);
			
			Factura f1 = new Factura(LocalDateTime.of(2018, 5, 2, 11, 00), "Café en la cafetería del colegio", 1.0f, c);
			Factura f2 = new Factura(LocalDateTime.of(2018, 5, 3, 7, 30), "Café y tostada en la cafetería del colegio", 1.8f, c);
			f1 = facturaService.save(f1);
			f2 = facturaService.save(f2);
			

			
			System.out.println(c);
			System.out.println(f1);
			System.out.println(f2);

			//Cliente c1 = clienteService.findOneConFacturas(c.getId());
			Cliente c1 = clienteService.findOne(c.getId());
			

			System.out.println(c1);
			
			
		};
	}
}
