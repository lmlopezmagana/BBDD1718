package com.salesianostriana.bd.servicioabstracto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORIA")
public class Categoria implements Identificable<Long> {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	@Column(name="NOMBRE")
	private String nombre;
		
	
	public Categoria() { }
	
	public Categoria(String nombre) {
		this.nombre = nombre;
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
	
	

}

