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
public class Direccion {

	@Id
	@GeneratedValue
	private Long id;

	private String calle;

	private String numero;

	private String ciudad;

	private String codigoPostal;

	@OneToMany(mappedBy = "direccion", cascade = CascadeType.ALL, orphanRemoval = true, fetch=FetchType.EAGER)
	private Set<PersonaDireccion> propietarios = new HashSet<>();

	public Direccion() {
	}

	public Direccion(String calle, String numero, String codigoPostal, String ciudad) {
		this.calle = calle;
		this.numero = numero;
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Set<PersonaDireccion> getPropietarios() {
		return propietarios;
	}

	public void setPropietarios(Set<PersonaDireccion> propietarios) {
		this.propietarios = propietarios;
	}
	
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public int hashCode() {
		return 31;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		return id != null && id.equals(other.id);
	}

	@Override
	public String toString() {
		return "Direccion [id=" + id + ", calle=" + calle + ", numero=" + numero + ", codigoPostal=" + codigoPostal
				+ ", ciudad="+  ciudad + "propietarios=" + propietarios.stream().map(PersonaDireccion::getPersona).map(Persona::getNombre)
						.collect(Collectors.joining(", "))
				+ "]";
	}

}
