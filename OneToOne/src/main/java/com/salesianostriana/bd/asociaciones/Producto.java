package com.salesianostriana.bd.asociaciones;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Producto {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	private float precio;
	
	public Producto() { }
	
	public Producto(String nombre, float precio) {
		this.nombre= nombre;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	

}
