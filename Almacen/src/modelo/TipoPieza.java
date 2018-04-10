package modelo;

import java.util.HashSet;
import java.util.Set;

public class TipoPieza {
	
	private String tipo;
	private String descripcion;
	//El otro lado de la composición (One2Many)
	private Set<Pieza> piezas = new HashSet<>();
	
}
