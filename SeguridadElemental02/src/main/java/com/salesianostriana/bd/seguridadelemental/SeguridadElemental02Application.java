package com.salesianostriana.bd.seguridadelemental;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.salesianostriana.bd.seguridadelemental.model.Usuario;
import com.salesianostriana.bd.seguridadelemental.service.UsuarioService;

@SpringBootApplication
public class SeguridadElemental02Application {

	public static void main(String[] args) {
		SpringApplication.run(SeguridadElemental02Application.class, args);
	}
	
	@Bean
	public CommandLineRunner insertInitialData(UsuarioService service) {
		return args -> {
			Usuario user1 = new Usuario();
			user1.setUsername("luismi");
			user1.setPass("luismi");
			user1.setAdmin(false);
			service.save(user1);
			
			Usuario user2 = new Usuario();
			user2.setUsername("admin");
			user2.setPass("admin");
			user2.setAdmin(true);
			service.save(user2);

		};
	}
	
	
}
