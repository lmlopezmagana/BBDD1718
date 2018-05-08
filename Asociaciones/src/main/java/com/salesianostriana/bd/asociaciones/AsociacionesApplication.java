package com.salesianostriana.bd.asociaciones;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.salesianostriana.bd.asociaciones.model.Task;
import com.salesianostriana.bd.asociaciones.model.User;
import com.salesianostriana.bd.asociaciones.services.TaskService;
import com.salesianostriana.bd.asociaciones.services.UserService;

@SpringBootApplication
public class AsociacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsociacionesApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner testDatabase(TaskService taskService, UserService userService) {
		return args -> {
			
			User usuario = new User("Luis Miguel", "López Magaña", "luismi.lopez@salesianos.edu");
			usuario = userService.save(usuario);
			
			Task task = new Task("Nueva tarea", "Estudiar JPA por un tubo", usuario);
			//task = taskService.save(task);
			usuario.addTask(task);
			
			usuario = userService.save(usuario);
			
			
			System.out.println(task.getUser().getFirstName());
			
			//usuario = userService.findOne(1L);
			
			//System.out.println(usuario.getTasks().size());
			System.out.println(usuario);
			
		};
	}
}
