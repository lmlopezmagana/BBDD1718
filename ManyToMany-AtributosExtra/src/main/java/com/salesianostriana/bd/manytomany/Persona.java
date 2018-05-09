package com.salesianostriana.bd.manytomany;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Persona {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	@OneToMany(mappedBy="persona", cascade = CascadeType.ALL, orphanRemoval = true, fetch=FetchType.EAGER)
	private Set<PersonaDireccion> direcciones  = new HashSet<>();
	
	public Persona() { }

	public Persona(String nombre) {
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

	public Set<PersonaDireccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(Set<PersonaDireccion> direcciones) {
		this.direcciones = direcciones;
	}

	@Override
	public int hashCode() {
		//return Objects.hash(nombre);
		return 31;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return id != null && id.equals(other.id);
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", direcciones=" + direcciones.stream().map(PersonaDireccion::getDireccion).map(Direccion::getCalle)
				.collect(Collectors.joining(", ")) + "]";
	}
	
	/*
	 * MÉTODOS HELPER
	 */
	public void addDireccion(Direccion direccion, String nombre) {
		PersonaDireccion personaDireccion = new PersonaDireccion(this, direccion, nombre);
		this.direcciones.add(personaDireccion);
		direccion.getPropietarios().add(personaDireccion);
	}
	
	public void removeDireccion(Direccion direccion) {
		PersonaDireccion personaDireccion = new PersonaDireccion(this, direccion);
		this.direcciones.remove(personaDireccion);
		direccion.getPropietarios().remove(personaDireccion);
	}
	
	
	

}
