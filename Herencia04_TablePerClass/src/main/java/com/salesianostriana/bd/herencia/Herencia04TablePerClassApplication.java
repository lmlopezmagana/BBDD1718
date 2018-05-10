package com.salesianostriana.bd.herencia;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Herencia04TablePerClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(Herencia04TablePerClassApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner testDatabase(CuentaService cService, CuentaCreditoService ccService, CuentaDebitoService cdService) {
		return args -> {
			
			
			Cuenta cuenta = new Cuenta();
			cuenta.setTitular("Luismi");
			cuenta.setBalance(500.0);
			cuenta.setTipoInteres(0.01);
			
			cService.save(cuenta);
			
			
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
