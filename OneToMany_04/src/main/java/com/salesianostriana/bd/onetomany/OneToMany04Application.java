package com.salesianostriana.bd.onetomany;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToMany04Application {

	public static void main(String[] args) {
		SpringApplication.run(OneToMany04Application.class, args);
	}
	
	
	/*
	 * En este caso, mantenemos lo que hemos hecho en el ejemplo 3, y ampliamos
	 * añadiendo la entidad LineaDeFactura, dejando que su gestión se lleve a través
	 * de la clase Factura.
	 */
	
	@Bean
	public CommandLineRunner testDatabase(ClienteService clienteService, FacturaService facturaService) {
		return args -> {
			
			Cliente c = new Cliente("Luismi", "luismi.lopez@salesianos.edu");
			c = clienteService.save(c);
			
			Factura f1 = new Factura(LocalDateTime.of(2018, 5, 2, 11, 00), "Café en la cafetería del colegio", 1.0f, c);
			//f1 = facturaService.save(f1);
			f1.addLinea(new LineaDeFactura("Café con leche", 1.0f, f1));
			f1 = facturaService.save(f1);

			Factura f2 = new Factura(LocalDateTime.of(2018, 5, 3, 7, 30), "Café y tostada en la cafetería del colegio", 1.8f, c);
			//f2 = facturaService.save(f2);
			f2.addLinea(new LineaDeFactura("Café con leche", 1.0f, f2));
			f2.addLinea(new LineaDeFactura("Media tostada con aceite", 0.8f, f2));
			f2 = facturaService.save(f2);
			
			c.addFactura(f1);
			c.addFactura(f2);
			
			System.out.println(c);
			System.out.println(f1);
			System.out.println(f2);

			
			Cliente c1 = clienteService.findOne(c.getId());
			System.out.println(c1);
			
			
		};
	}
}
