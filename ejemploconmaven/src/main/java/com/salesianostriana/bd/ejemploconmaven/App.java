package com.salesianostriana.bd.ejemploconmaven;

import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.impl.factory.Lists;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ImmutableList<String> pentateuco = 
				Lists.immutable.of("Génesis", "Éxodo", "Levítico", 
						"Números", "Deuteronomio");
		
		for(String s : pentateuco) {
			System.out.println(s);
		}
    }
}
