package com.salesianostriana.bd.seguridadelemental;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.salesianostriana.bd.seguridadelemental.model.Usuario;
import com.salesianostriana.bd.seguridadelemental.service.UsuarioService;

@SpringBootApplication
public class SeguridadElemental01Application {

	public static void main(String[] args) {
		SpringApplication.run(SeguridadElemental01Application.class, args);
	}
	
	@Bean
	public CommandLineRunner insertInitialData(UsuarioService service) {
		return args -> {
			Usuario nuevoUsuario = new Usuario();
			nuevoUsuario.setUsername("luismi");
			nuevoUsuario.setPass("luismi");
			service.save(nuevoUsuario);
		};
	}
	
	
}
