package com.salesianostriana.bd.consultas.modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORIA")
public class Categoria  {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	@Column(name="NOMBRE")
	private String nombre;
	
	@OneToMany(mappedBy="categoria")
	private Set<Producto> productos = new HashSet<>();
		
	
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

