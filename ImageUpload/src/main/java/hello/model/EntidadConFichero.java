package hello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Un ejemplo de entidad que almacena la URL de un fichero subido y otros datos
 * 
 * @author luismi
 *
 */
@Entity
public class EntidadConFichero {
	
	@Id
	@GeneratedValue
	private Long id;
	
	// Una propiedad cualquiera
	private String propiedadCualquiera;
	// La URL del fichero subido a imgur
	private String fileUrl;
	
	public EntidadConFichero() { }

	public String getPropiedadCualquiera() {
		return propiedadCualquiera;
	}

	public void setPropiedadCualquiera(String propiedadCualquiera) {
		this.propiedadCualquiera = propiedadCualquiera;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public Long getId() {
		return id;
	}
	
	
	

}
