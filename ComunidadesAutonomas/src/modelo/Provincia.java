package modelo;

import java.util.HashSet;
import java.util.Set;

public class Provincia {
	
	private int codProvincia;
	private String nombre;
	private float superficie;
	//Asociación de composición con ComunidadAutonoma
	private ComunidadAutonoma comunidadAutonoma;
	//Asociación de composición con Localidad;
	private Set<Localidad> localidades = new HashSet<>();
	//Asociación de capital
	private Localidad capitalDeProvincia;
	
	
	public Provincia() { } 
	
	public Provincia(int codProvincia, String nombre, float superficie, ComunidadAutonoma comunidadAutonoma,
			Set<Localidad> localidades, Localidad capitalDeProvincia) {
		super();
		this.codProvincia = codProvincia;
		this.nombre = nombre;
		this.superficie = superficie;
		this.comunidadAutonoma = comunidadAutonoma;
		this.localidades = localidades;
		this.capitalDeProvincia = capitalDeProvincia;
	}


	public int getCodProvincia() {
		return codProvincia;
	}


	public void setCodProvincia(int codProvincia) {
		this.codProvincia = codProvincia;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getSuperficie() {
		return superficie;
	}


	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}


	public ComunidadAutonoma getComunidadAutonoma() {
		return comunidadAutonoma;
	}


	public void setComunidadAutonoma(ComunidadAutonoma comunidadAutonoma) {
		this.comunidadAutonoma = comunidadAutonoma;
	}


	public Set<Localidad> getLocalidades() {
		return localidades;
	}


	public void setLocalidades(Set<Localidad> localidades) {
		this.localidades = localidades;
	}


	public Localidad getCapitalDeProvincia() {
		return capitalDeProvincia;
	}


	public void setCapitalDeProvincia(Localidad capitalDeProvincia) {
		this.capitalDeProvincia = capitalDeProvincia;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capitalDeProvincia == null) ? 0 : capitalDeProvincia.hashCode());
		result = prime * result + codProvincia;
		result = prime * result + ((comunidadAutonoma == null) ? 0 : comunidadAutonoma.hashCode());
		result = prime * result + ((localidades == null) ? 0 : localidades.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + Float.floatToIntBits(superficie);
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
		Provincia other = (Provincia) obj;
		if (capitalDeProvincia == null) {
			if (other.capitalDeProvincia != null)
				return false;
		} else if (!capitalDeProvincia.equals(other.capitalDeProvincia))
			return false;
		if (codProvincia != other.codProvincia)
			return false;
		if (comunidadAutonoma == null) {
			if (other.comunidadAutonoma != null)
				return false;
		} else if (!comunidadAutonoma.equals(other.comunidadAutonoma))
			return false;
		if (localidades == null) {
			if (other.localidades != null)
				return false;
		} else if (!localidades.equals(other.localidades))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Float.floatToIntBits(superficie) != Float.floatToIntBits(other.superficie))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Provincia [codProvincia=" + codProvincia + ", nombre=" + nombre + ", superficie=" + superficie
				+ ", comunidadAutonoma=" + comunidadAutonoma + ", localidades=" + localidades + ", capitalDeProvincia="
				+ capitalDeProvincia + "]";
	}
	
	
	
	
	/*
	 * OTROS MÉTODOS QUE NOS VAN A AYUDAR
	 */
	
	

	public void addLocalidad(Localidad l) {
		if (localidades == null)
			localidades = new HashSet<>();
		
		localidades.add(l);
		
		//Como la asociación es bidireccional, es necesario también esto
		l.setProvincia(this);
	}
	
	
	
	
	
	

}
