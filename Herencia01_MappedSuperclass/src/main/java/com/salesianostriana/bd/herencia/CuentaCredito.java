package com.salesianostriana.bd.herencia;

import javax.persistence.Entity;

@Entity
public class CuentaCredito extends Cuenta {
	
	private double limiteCredito;

	public CuentaCredito() {
		super();
	}   
	public double getLimiteCredito() {
		return this.limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

}
