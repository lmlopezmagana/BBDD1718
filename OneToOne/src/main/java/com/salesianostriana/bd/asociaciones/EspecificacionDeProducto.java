package com.salesianostriana.bd.asociaciones;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class EspecificacionDeProducto {
	
	@Id
	private Long id;
	
	@Lob
	private String descripcion;
	
	private String imagen;
	
	@OneToOne(fetch=FetchType.LAZY)
	@MapsId
	@JoinColumn(name="id")
	private Producto producto;
	
	public EspecificacionDeProducto() { }
	
	public EspecificacionDeProducto(String descripcion, String imagen) {
		this.descripcion = descripcion;
		this.imagen = imagen;
	}


	public EspecificacionDeProducto(String descripcion, String imagen, Producto producto) {
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.producto = producto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	
	
	

}
