package modelo;

import java.util.HashSet;
import java.util.Set;

public class Estanteria {

	private char letra;
	//Composición
	private Almacen almacen;
	//Esto no es obligatorio; solo si queremos
	//dar un tratamiento bidireccional
	private Set<Pieza> piezas = new HashSet<>();
	
}
