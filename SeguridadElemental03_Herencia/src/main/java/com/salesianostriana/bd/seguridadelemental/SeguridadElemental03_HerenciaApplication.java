package com.salesianostriana.bd.seguridadelemental;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.salesianostriana.bd.seguridadelemental.model.Administrador;
import com.salesianostriana.bd.seguridadelemental.model.UsuarioBasico;
import com.salesianostriana.bd.seguridadelemental.service.AdministradorService;
import com.salesianostriana.bd.seguridadelemental.service.UsuarioBasicoService;

@SpringBootApplication
public class SeguridadElemental03_HerenciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeguridadElemental03_HerenciaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner insertInitialData(UsuarioBasicoService uBservice, AdministradorService aService) {
		return args -> {
//			Usuario user1 = new Usuario();
//			user1.setUsername("luismi");
//			user1.setPass("luismi");
//			//user1.setAdmin(false);
//			service.save(user1);
//			
//			Usuario user2 = new Usuario();
//			user2.setUsername("admin");
//			user2.setPass("admin");
//			//user2.setAdmin(true);
//			service.save(user2);
			
			UsuarioBasico basico = new UsuarioBasico();
			basico.setUsername("luismi");
			basico.setPass("luismi");
			uBservice.save(basico);
			
			Administrador admin = new Administrador();
			admin.setUsername("admin");
			admin.setPass("admin");
			aService.save(admin);

		};
	}
	
	
}
