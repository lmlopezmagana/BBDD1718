package modelo;

import java.util.HashSet;
import java.util.Set;

public class ComunidadAutonoma {
	
	private int idComunidad;
	private String nombre;
	//Asociación de composición con provincia
	private Set<Provincia> provincias;
	//Asociación de capitalidad
	private Localidad capitalDeComunidad;
	
	
	public ComunidadAutonoma() {
		
	}


	public ComunidadAutonoma(int idComunidad, String nombre, Set<Provincia> provincias, Localidad capitalDeComunidad) {
		super();
		this.idComunidad = idComunidad;
		this.nombre = nombre;
		this.provincias = provincias;
		this.capitalDeComunidad = capitalDeComunidad;
	}


	public int getIdComunidad() {
		return idComunidad;
	}


	public void setIdComunidad(int idComunidad) {
		this.idComunidad = idComunidad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Set<Provincia> getProvincias() {
		return provincias;
	}


	public void setProvincias(Set<Provincia> provincias) {
		this.provincias = provincias;
	}


	public Localidad getCapitalDeComunidad() {
		return capitalDeComunidad;
	}


	public void setCapitalDeComunidad(Localidad capitalDeComunidad) {
		this.capitalDeComunidad = capitalDeComunidad;
	}


	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capitalDeComunidad == null) ? 0 : capitalDeComunidad.hashCode());
		result = prime * result + idComunidad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((provincias == null) ? 0 : provincias.hashCode());
		return result;
	}*/


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComunidadAutonoma other = (ComunidadAutonoma) obj;
		if (capitalDeComunidad == null) {
			if (other.capitalDeComunidad != null)
				return false;
		} else if (!capitalDeComunidad.equals(other.capitalDeComunidad))
			return false;
		if (idComunidad != other.idComunidad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (provincias == null) {
			if (other.provincias != null)
				return false;
		} else if (!provincias.equals(other.provincias))
			return false;
		return true;
	}
	
	
	/*
	 * OTROS MÉTODOS QUE NOS VAN A AYUDAR
	 */
	
	public void addProvincia(Provincia p) {
		if (provincias == null)
			provincias = new HashSet<>();
		
		provincias.add(p);
		
		//Como la asociación es bidireccional, es necesario también esto
		p.setComunidadAutonoma(this);
	}
	
	

}
