package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Ejemplo de subida de un fichero con peticiones multiparte,
 * basado en el ejemplo de la documentación de Spring
 * @see <a href="https://spring.io/guides/gs/uploading-files/">Uploading Files</a>
 * 
 * Como modificación, las imágenes no se suben al sistema de ficheros 
 * del servidor donde reside la aplicación, sino que se suben de forma
 * anónima a imgur mediante su api rest.
 * 
 * @author Luis Miguel López
 *
 */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
}
