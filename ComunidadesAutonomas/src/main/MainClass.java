package main;

import modelo.ComunidadAutonoma;
import modelo.Localidad;
import modelo.Provincia;

public class MainClass {

	public static void main(String[] args) {

		//Localidades
		Localidad jaen = new Localidad();
		jaen.setNombre("Ja�n");
		
		Localidad cordoba = new Localidad();
		cordoba.setNombre("C�rdoba");
		
		Localidad sevilla = new Localidad();
		sevilla.setNombre("Sevilla");

		Localidad huelva = new Localidad();
		huelva.setNombre("Huelva");
		
		Localidad cadiz = new Localidad();
		cadiz.setNombre("C�diz");

		Localidad malaga = new Localidad();
		malaga.setNombre("M�laga");
		
		Localidad granada = new Localidad();
		granada.setNombre("Granada");
		
		Localidad almeria = new Localidad();
		almeria.setNombre("Almer�a");
		


		//Provincias
		Provincia p_jaen = new Provincia();
		jaen.setNombre("Ja�n");
		
		Provincia p_cordoba = new Provincia();
		cordoba.setNombre("C�rdoba");
		
		Provincia p_sevilla = new Provincia();
		sevilla.setNombre("Sevilla");

		Provincia p_huelva = new Provincia();
		huelva.setNombre("Huelva");
		
		Provincia p_cadiz = new Provincia();
		cadiz.setNombre("C�diz");

		Provincia p_malaga = new Provincia();
		malaga.setNombre("M�laga");
		
		Provincia p_granada = new Provincia();
		granada.setNombre("Granada");
		
		Provincia p_almeria = new Provincia();
		almeria.setNombre("Almer�a");

		
		//Asociamos localidades y provincias
		p_jaen.addLocalidad(jaen);
		p_cordoba.addLocalidad(cordoba);
		p_sevilla.addLocalidad(sevilla);
		p_huelva.addLocalidad(huelva);
		p_cadiz.addLocalidad(cadiz);
		p_malaga.addLocalidad(malaga);
		p_granada.addLocalidad(granada);
		p_almeria.addLocalidad(almeria);
		
		//Establecemos las capitales
		p_jaen.setCapitalDeProvincia(jaen);
		p_cordoba.setCapitalDeProvincia(cordoba);
		p_sevilla.setCapitalDeProvincia(sevilla);
		p_huelva.setCapitalDeProvincia(huelva);
		p_cadiz.setCapitalDeProvincia(cadiz);
		p_malaga.setCapitalDeProvincia(malaga);
		p_granada.setCapitalDeProvincia(granada);
		p_almeria.setCapitalDeProvincia(almeria);
				
		
		//Comunidad Aut�noma
		ComunidadAutonoma andalucia = new ComunidadAutonoma();
		andalucia.setIdComunidad(1);
		andalucia.setNombre("Andaluc�a");
		
		
		//Asociamos provincias y comunidad aut�noma
		andalucia.addProvincia(p_jaen);
		andalucia.addProvincia(p_cordoba);
		andalucia.addProvincia(p_sevilla);
		andalucia.addProvincia(p_huelva);
		andalucia.addProvincia(p_cadiz);
		andalucia.addProvincia(p_malaga);
		andalucia.addProvincia(p_granada);
		andalucia.addProvincia(p_almeria);
		
		//Establecemos la capital de la comunidad autonoma
		andalucia.setCapitalDeComunidad(sevilla);
		

	}

}
