package com.salesianostriana.bd.manytomany;

import java.io.Serializable;

public class PersonaDireccionId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1015747476138680458L;
	
	private Long persona;
	private Long direccion;
	
	public PersonaDireccionId() { }

	public Long getPersona() {
		return persona;
	}

	public void setPersona(Long persona) {
		this.persona = persona;
	}

	public Long getDireccion() {
		return direccion;
	}

	public void setDireccion(Long direccion) {
		this.direccion = direccion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((persona == null) ? 0 : persona.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonaDireccionId other = (PersonaDireccionId) obj;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (persona == null) {
			if (other.persona != null)
				return false;
		} else if (!persona.equals(other.persona))
			return false;
		return true;
	}
	
	
	

}
