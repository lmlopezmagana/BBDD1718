package com.salesianostriana.bd.manytomany;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Libro {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String titulo;
	
	@ManyToMany
	@JoinTable(name="autor_libro", 
		joinColumns=@JoinColumn(name="libro_id"), inverseJoinColumns=@JoinColumn(name="autor_id"))  
	private Set<Autor> autores = new HashSet<>();
	
	public Libro() { }

	public Libro(String titulo) {
		this.titulo = titulo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Set<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autores == null) ? 0 : autores.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Libro other = (Libro) obj;
		if (autores == null) {
			if (other.autores != null)
				return false;
		} else if (!autores.equals(other.autores))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", autores=" + autores.stream().map(Autor::getNombre).collect(Collectors.joining(", ")) + "]";
	}
	
	
	/*
	 * MÉTODOS HELPER
	 */
	
	public void addAutor(Autor a) {
		if (a != null) {
			a.getLibros().add(this);
			this.getAutores().add(a);
		}
			
	}
	
	public void removeAutor(Autor a) {
		if (a != null) {
			a.getLibros().remove(this);
			this.getAutores().remove(a);
		}
	}

}
