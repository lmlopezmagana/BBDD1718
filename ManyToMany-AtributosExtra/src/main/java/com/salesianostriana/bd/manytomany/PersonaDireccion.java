package com.salesianostriana.bd.manytomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(PersonaDireccionId.class)
public class PersonaDireccion {
	
	@Id
	@ManyToOne
	@JoinColumn(name="persona_id", insertable=false, updatable=false)
	private Persona persona;
	
	@Id
	@ManyToOne
	@JoinColumn(name="direccion_id", insertable=false, updatable=false)
	private Direccion direccion;
	
	private String tituloDireccion;
	
	public PersonaDireccion() { }

	public PersonaDireccion(Persona persona, Direccion direccion) {
		this.persona = persona;
		this.direccion = direccion;
	}

	public PersonaDireccion(Persona persona, Direccion direccion, String tituloDireccion) {
		this.persona = persona;
		this.direccion = direccion;
		this.tituloDireccion = tituloDireccion;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getTituloDireccion() {
		return tituloDireccion;
	}

	public void setTituloDireccion(String tituloDireccion) {
		this.tituloDireccion = tituloDireccion;
	}

	@Override
	public int hashCode() {
		//return Objects.hash(persona, direccion);
		return 37;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		PersonaDireccion other = (PersonaDireccion) obj;
		return persona != null && direccion != null && persona.equals(other.persona) && direccion.equals(other.direccion);
	}

	@Override
	public String toString() {
		return "PersonaDireccion [persona=" + persona + ", direccion=" + direccion + ", tituloDireccion="
				+ tituloDireccion + "]";
	}
	
	

}
