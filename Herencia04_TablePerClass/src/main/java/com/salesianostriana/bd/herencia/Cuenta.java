package com.salesianostriana.bd.herencia;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;



@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)	
public class Cuenta {

	   
	@Id
	@GeneratedValue
	private long id;
	private String titular;
	private double balance;
	private double tipoInteres;

	public Cuenta() {
		super();
	}   
	public long getId() {
		return this.id;
	}

	  
	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}   
	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}   
	public double getTipoInteres() {
		return this.tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
   
}