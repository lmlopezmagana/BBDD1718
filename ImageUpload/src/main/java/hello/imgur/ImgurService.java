package hello.imgur;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Servicio con los métodos de interacción con el API de Imgur.
 * En la versión actual, solo está implementado el método de subida.
 * 
 * @author luismi
 * @version 1.0
 *
 */
@Service
public class ImgurService {
	
	// URL del servicio de subida. Se llama con método POST
	private static final String URL_POST = "https://api.imgur.com/3/image";
	
	/**
	 * Método que realiza la subida de un objeto de tipo Imagen a imgur.
	 * Si hay algún problema en la subida, devolvemos valor nulo.
	 * 
	 * @param imagen Imagen a subir
	 * @return Nulo en caso de error o problemas con la subida. RespuestaImagen, en caso de éxito.
	 */
	public RespuestaImagen uploadToImgur(Imagen imagen) {
		
		HttpHeaders headers = new HttpHeaders();
		//TODO Implementar la asignación de este ID mediante otro mecanismo para que cada persona pueda utilizar el suyo
		headers.add("Authorization", "Client-ID 55eb55cd14ff95d");
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		RestTemplate restTemplate = new RestTemplate();
		
		HttpEntity<Imagen> imagenEntity = new HttpEntity<>(imagen, headers); 
		
		RespuestaImagen respuesta = restTemplate.postForObject(URL_POST, imagenEntity, RespuestaImagen.class);
		
		if (respuesta != null) {
			if (respuesta.getStatus() == 200) {
				return respuesta;
			} 
		}
		
		return null;
	}
	
	

}
