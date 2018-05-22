package hello.imgur;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Esta clase encapsula los datos que devuelve como respuesta una petición
 * POST de subida de imagenes a través del servicio imgur.
 * 
 * @see <a href="https://api.imgur.com/3/image">https://api.imgur.com/3/image</a>
 * @author luismi
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RespuestaImagen {
	
	private InfoImagen data;
	private String success;
	private int status;
	
	public RespuestaImagen() { } 
	
	public RespuestaImagen(InfoImagen data, String success, int status) {
		super();
		this.data = data;
		this.success = success;
		this.status = status;
	}

	public InfoImagen getData() {
		return data;
	}

	public void setData(InfoImagen data) {
		this.data = data;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "RespuestaImagen [data=" + data + ", success=" + success + ", status=" + status + "]";
	}
	
	
	
	

}
