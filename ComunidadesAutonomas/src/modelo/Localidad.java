package modelo;

public class Localidad {
	
	private int idLocalidad;
	private String nombre;
	private int numHabitantes;
	//Asociación de composición con provincia;
	private Provincia provincia;
	
	
	public Localidad() { }
	
	public Localidad(int idLocalidad, String nombre, int numHabitantes, Provincia provincia) {
		super();
		this.idLocalidad = idLocalidad;
		this.nombre = nombre;
		this.numHabitantes = numHabitantes;
		this.provincia = provincia;
	}

	public int getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumHabitantes() {
		return numHabitantes;
	}

	public void setNumHabitantes(int numHabitantes) {
		this.numHabitantes = numHabitantes;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idLocalidad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + numHabitantes;
		//result = prime * result + ((provincia == null) ? 0 : provincia.hashCode());
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
		Localidad other = (Localidad) obj;
		if (idLocalidad != other.idLocalidad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numHabitantes != other.numHabitantes)
			return false;
		if (provincia == null) {
			if (other.provincia != null)
				return false;
		} else if (!provincia.equals(other.provincia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Localidad [idLocalidad=" + idLocalidad + ", nombre=" + nombre + ", numHabitantes=" + numHabitantes
				+ ", provincia=" + provincia + "]";
	}
	
	
	
	
	

}
