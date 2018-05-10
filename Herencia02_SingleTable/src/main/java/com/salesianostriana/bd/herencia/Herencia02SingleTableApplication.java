package com.salesianostriana.bd.herencia;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Herencia02SingleTableApplication {

	public static void main(String[] args) {
		SpringApplication.run(Herencia02SingleTableApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner testDatabase(CuentaCreditoService ccService, CuentaDebitoService cdService) {
		return args -> {
			
			/*
			 * Con SINGLE_TABLE la clase base TAMBIÉN es una entidad, con lo cual podemos tener
			 * 
			 * - Cuentas (básicas)
			 * - Cuentas de cŕedito
			 * - Cuentas de débito
			 * 
			 * 
			 * En el caso de que no quisiéramos tener Cuentas (básicas), lo que deberíamos hacer
			 * es marcarla commo abstracta, y no crear ni el repositorio ni el servicio de la misma
			 * (que es precisamente lo que hemos hecho en este ejemplo)
			 */
			
			CuentaCredito cuentaCredito = new CuentaCredito();
			cuentaCredito.setTitular("Luismi");
			cuentaCredito.setBalance(500.0);
			cuentaCredito.setTipoInteres(0.20);
			cuentaCredito.setLimiteCredito(600.0);
			
			ccService.save(cuentaCredito);

			
			CuentaDebito cuentaDebito = new CuentaDebito();
			cuentaDebito.setTitular("Luismi");
			cuentaDebito.setBalance(200.0);
			cuentaCredito.setTipoInteres(0.10);
			cuentaDebito.setCargoPorDescubierto(6.5);
			
			cdService.save(cuentaDebito);
			
			
			
		};
	}
}
