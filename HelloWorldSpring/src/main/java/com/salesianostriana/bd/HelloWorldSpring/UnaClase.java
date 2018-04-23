package com.salesianostriana.bd.HelloWorldSpring;

public class UnaClase {
	
	private String propiedad1;
	private float propiedad2;
	
	
	public String getPropiedad1() {
		return propiedad1;
	}
	public void setPropiedad1(String propiedad1) {
		this.propiedad1 = propiedad1;
	}
	public float getPropiedad2() {
		return propiedad2;
	}
	public void setPropiedad2(float propiedad2) {
		this.propiedad2 = propiedad2;
	}
	
	
	@Override
	public String toString() {
		return "UnaClase [propiedad1=" + propiedad1 + ", propiedad2=" + propiedad2 + "]";
	}
	
	
	
	

}
