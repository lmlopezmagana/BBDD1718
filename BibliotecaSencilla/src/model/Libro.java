package model;

import java.util.List;
import java.util.Set;

public class Libro {
	
	private String isbn;
	private String editorial;
	private int anioEscritura;
	private String titulo;
	//Optativo 
	//private List<Copia> copias;
	private Set<Copia> copias;
	//Muchos a muchos
	private List<Autor> autores;
	

}


