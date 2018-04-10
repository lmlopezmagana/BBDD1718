package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pieza {
	
	private int modelo;
	private float precio;
	private String descripcion;
	//Composici�n (Many2One)
	private TipoPieza tipoPieza;
	//se-almacena
	private Estanteria estanteria;
	//compuesta-de
	//private Set<Pieza> compuestaDe = new HashSet<>();
	//Si esta asociaci�n permite repetidos...
	private List<Pieza> compuestaDe = new ArrayList<>();

}
