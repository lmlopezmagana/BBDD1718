package hello.imgur;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Esta clase encapsula la información "mínima" que necesitamos de la imagen, y que viene
 * dentro de un objeto de tipo RespuestaImagen.
 * @author luismi
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InfoImagen {
	
	// Título de la imagen (puede ser nulo). Lo hemos enviado nosotros
	private String title;
	// Descripción de la imagen (puede ser nulo). Lo hemos enviado nosotros
	private String description;
	// Nombre del fichero. Lo hemos enviado nosotros
	private String name;
	// Enlace a la imagen almacenada en imgur
	private String link;
	// Hash a utilizar para borrar la imagen. 
	// La URL de borrado debe ser: https://api.imgur.com/3/image/{{imageDeleteHash}}
	private String deletehash;
	
	public InfoImagen() { }

	public InfoImagen(String title, String description, String name, String link, String deletehash) {
		super();
		this.title = title;
		this.description = description;
		this.name = name;
		this.link = link;
		this.deletehash = deletehash;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDeletehash() {
		return deletehash;
	}

	public void setDeletehash(String deletehash) {
		this.deletehash = deletehash;
	}

	@Override
	public String toString() {
		return "InfoImagen [title=" + title + ", description=" + description + ", name=" + name + ", link=" + link
				+ ", deletehash=" + deletehash + "]";
	}

	
	

}
