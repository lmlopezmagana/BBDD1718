package com.salesianostriana.bd.HelloWorldSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/salesianostriana/bd/beans.xml");
    	
    	UnaClase objeto = (UnaClase) appContext.getBean(UnaClase.class);
    	
    	System.out.println(objeto.getPropiedad1());
    	
    }
}
