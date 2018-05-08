package com.salesianostriana.bd.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LineaDeFactura {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String producto;
	
	private float pvp;
	
	@ManyToOne
	private Factura factura;
	
	public LineaDeFactura() { }

	public LineaDeFactura(String producto, float pvp, Factura factura) {
		this.producto = producto;
		this.pvp = pvp;
		this.factura = factura;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public float getPvp() {
		return pvp;
	}

	public void setPvp(float pvp) {
		this.pvp = pvp;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((factura == null) ? 0 : factura.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
		result = prime * result + Float.floatToIntBits(pvp);
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
		LineaDeFactura other = (LineaDeFactura) obj;
		if (factura == null) {
			if (other.factura != null)
				return false;
		} else if (!factura.equals(other.factura))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		if (Float.floatToIntBits(pvp) != Float.floatToIntBits(other.pvp))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LineaDeFactura [id=" + id + ", producto=" + producto + ", pvp=" + pvp + ", factura=" + factura.getId() + "]";
	}
	
	
	

}
