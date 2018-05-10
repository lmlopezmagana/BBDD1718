package com.salesianostriana.bd.herencia;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Herencia01MappedSuperclassApplication {

	public static void main(String[] args) {
		SpringApplication.run(Herencia01MappedSuperclassApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner testDatabase(CuentaCreditoService ccService, CuentaDebitoService cdService) {
		return args -> {
			
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
