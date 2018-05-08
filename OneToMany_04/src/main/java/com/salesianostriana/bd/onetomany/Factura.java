package com.salesianostriana.bd.onetomany;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Factura {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private LocalDateTime fecha;
	
	private String concepto;
	
	private float importe;
	
	@ManyToOne
	private Cliente cliente;
	
	@OneToMany(mappedBy="factura", cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.EAGER)
	Set<LineaDeFactura> lineasDeFactura = new HashSet<>();
	
	public Factura() { }

	public Factura(LocalDateTime fecha, String concepto, float importe, Cliente cliente) {
		this.fecha = fecha;
		this.concepto = concepto;
		this.importe = importe;
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

	public Set<LineaDeFactura> getLineasDeFactura() {
		return lineasDeFactura;
	}

	public void setLineasDeFactura(Set<LineaDeFactura> lineasDeFactura) {
		this.lineasDeFactura = lineasDeFactura;
	}

	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((concepto == null) ? 0 : concepto.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + Float.floatToIntBits(importe);
		//result = prime * result + ((lineasDeFactura == null) ? 0 : lineasDeFactura.hashCode());
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
		Factura other = (Factura) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (concepto == null) {
			if (other.concepto != null)
				return false;
		} else if (!concepto.equals(other.concepto))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Float.floatToIntBits(importe) != Float.floatToIntBits(other.importe))
			return false;
		if (lineasDeFactura == null) {
			if (other.lineasDeFactura != null)
				return false;
		} else if (!lineasDeFactura.equals(other.lineasDeFactura))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", fecha=" + fecha + ", concepto=" + concepto + ", importe=" + importe
				+ ", cliente=" + cliente.getId() + " " + cliente.getNombre() + ", lineasDeFactura=" + lineasDeFactura + "]";
	}
	
	/*
	 * Métodos helper
	 */
	
	public void addLinea(LineaDeFactura ldf) {
		if (ldf != null) {
			ldf.setFactura(this);
			this.getLineasDeFactura().add(ldf);
		}
	}
	
	public void removeLinea(LineaDeFactura ldf) {
		if (ldf != null) {
			ldf.setFactura(null);
			this.getLineasDeFactura().remove(ldf);
		}
	}
	

}
