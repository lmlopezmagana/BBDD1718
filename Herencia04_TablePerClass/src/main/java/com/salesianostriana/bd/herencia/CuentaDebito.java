package com.salesianostriana.bd.herencia;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CD")
public class CuentaDebito extends Cuenta {
	
	private double cargoPorDescubierto;

	public CuentaDebito() {
		super();
	}   
	public double getCargoPorDescubierto() {
		return this.cargoPorDescubierto;
	}

	public void setCargoPorDescubierto(double cargoPorDescubierto) {
		this.cargoPorDescubierto = cargoPorDescubierto;
	}


}
