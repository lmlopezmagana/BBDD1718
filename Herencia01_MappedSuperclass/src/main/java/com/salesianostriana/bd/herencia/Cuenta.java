package com.salesianostriana.bd.herencia;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


/*
 * Esta clase base NO ES UNA ENTIDAD, por lo que no se mapea dentro del contexto de
 * persistencia, ni tendrá una tabla en la base de datos.
 * 
 * Sirve para que otras clases (estas sí, entidades) hereden de ella. Es herencia de POO.
 * 
 * Todas las clases que hereden de ella son entidades independientes, con sus propias tablas. 
 * 
 * 
 */

@MappedSuperclass
public abstract class Cuenta {

	   
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