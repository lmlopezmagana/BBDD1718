package modelo;

import java.util.HashSet;
import java.util.Set;

public class Almacen {
	
	private int nAlmacen;
	private String descripcion;
	private String direccion;
	//El otro lado de la composición
	private Set<Estanteria> estanterias = new HashSet<>();

}
