package com.salesianostriana.bd.daoconspring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.salesianostriana.bd.daoconspring.dao.DaoProducto;
import com.salesianostriana.bd.daoconspring.modelo.Producto;


/**
 * Hello world!
 *
 */
@Component
public class App 
{
	
	@Autowired
	DaoProducto dao;
	
	
    public static void main( String[] args )
    {
    	// Cargamos el contexto	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
    	// A modo ilustrativo, imprimimos la lista de Beans que hay cargados en el contexto.
    	System.out.println(Arrays.asList(appContext.getBeanDefinitionNames()));
    	
    	/*
    	 * Estas dos líneas no tendremos que usarlas en las aplicaciones con Spring Boot. 
    	 */
    	// Obtenemos la instancia de la clase App
    	App appInstance = appContext.getBean(App.class);    	
    	appInstance.app();
    	
    }
    
    
    public void app() {
		dao.create(new Producto(1, "Cerveza Cruzcampo", "Botellín de 25cl",0.5f));
		dao.create(new Producto(2, "Jamón Ibérico de Bellota", "Pieza de 7kg aprox.", 300.0f));
		

		dao.findAll().forEach(System.out::println);
		System.out.println(dao.findOne(1L));

    }
    
}
