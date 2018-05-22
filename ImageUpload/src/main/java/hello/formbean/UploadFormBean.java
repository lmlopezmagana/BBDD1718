package hello.formbean;

/**
 * 
 * Form Bean que nos permite recoger todos los datos del formulario
 * menos los ficheros a subir
 * 
 * @author luismi
 *
 */
public class UploadFormBean {
	
	private String propiedadCualquiera;
	
	public UploadFormBean() {}

	public String getPropiedadCualquiera() {
		return propiedadCualquiera;
	}

	public void setPropiedadCualquiera(String propiedadCualquiera) {
		this.propiedadCualquiera = propiedadCualquiera;
	}
	
	

}
