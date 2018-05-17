package com.salesianostriana.bd.servicioabstracto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTO")
public class Producto implements Identificable<Long> {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="PVP")
	private float pvp;
	@Column(name="DESCUENTO")
	private float descuento;
	
	@ManyToOne
	@JoinColumn(name="CATEGORIA_ID")
	private Categoria categoria;
	
	public Producto() { }

	public Producto(String nombre, float pvp, float descuento, Categoria categoria) {
		this.nombre = nombre;
		this.pvp = pvp;
		this.descuento = descuento;
		this.categoria = categoria;
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

	public float getPvp() {
		return pvp;
	}

	public void setPvp(float pvp) {
		this.pvp = pvp;
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	
	
	
	
	
}
