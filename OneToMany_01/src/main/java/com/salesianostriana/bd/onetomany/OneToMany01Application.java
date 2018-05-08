package com.salesianostriana.bd.onetomany;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToMany01Application {

	public static void main(String[] args) {
		SpringApplication.run(OneToMany01Application.class, args);
	}
	
	/*
	 * En este ejemplo, la asociación será UNIDIRECCIONAL (es decir, solo
	 * utilizamos la anotación @ManyToOne).
	 * 
	 * Si queremos obtener todas las facturas de un cliente, necesitamos una
	 * consulta sobre la entidad Facturas.
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
			
			Iterable<Factura> facturasDeLuismi = facturaService.deCliente(c);
			
			for(Factura f : facturasDeLuismi) {
				System.out.println(f);
			}
			
		};
	}
}
