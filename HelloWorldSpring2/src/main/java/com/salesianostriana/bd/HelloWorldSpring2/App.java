package com.salesianostriana.bd.HelloWorldSpring2;

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
        //System.out.println( "Hello World!" );
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/salesianostriana/bd/beans.xml");
    	
    	UnaClase objeto = (UnaClase) appContext.getBean("objeto2");
    	
    	System.out.println(objeto);
    	
    	
    	
    	
    }
}
