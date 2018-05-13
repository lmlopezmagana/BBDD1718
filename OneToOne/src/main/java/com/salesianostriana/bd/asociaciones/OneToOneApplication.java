package com.salesianostriana.bd.asociaciones;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner testDatabase(ProductoService service) {
		return args -> {
			
			Producto p1 = new Producto("Portátil HP 15-BS127NS Intel Core i5-8250U/8GB/256GB SSD/15.6\"", 599.0f);
			EspecificacionDeProducto ep1 = new EspecificacionDeProducto("Procesador Intel® Core™ i5-8250U (frecuencia base de 1,6 GHz, hasta 3,5 GHz con tecnología Intel® Turbo Boost, 6 MB de caché, 4 núcleos)\n" + 
					"Memoria RAM SDRAM de 8 GB DDR4-2400 (1 x 4 GB) Velocidades de transferencia de hasta 2400 MT/s\n" + 
					"Almacenamiento SSD M.2 de 256 GB\n" + 
					"Almacenamiento óptico DVD-writer\n" + 
					"Display Pantalla con retroiluminación WLED HD SVA BrightView de 39,6 cm (15,6 pulgadas) en diagonal (1366 x 768)\n" + 
					"Controlador gráfico Integrada Intel® UHD Graphics 620\n" + 
					"Conectividad\n" + 
					"LAN 10/100/1000 GbE integrada\n" + 
					"Combo de Intel® 802.11b/g/n/ac (2x2) Wi-Fi® y Bluetooth® 4.2 (Compatible con Miracast)\n" + 
					"Cámara de portátil Cámara HD HP TrueVision con micrófono digital integrado\n" + 
					"Micrófono Sí\n" + 
					"Batería 4 celdas Ion de litio 41 Wh\n" + 
					"Conexiones\n" + 
					"2 USB 3.1 Gen 1 (solo transferencia de datos);\n" + 
					"1 USB 2.0;\n" + 
					"1 HDMI;\n" + 
					"1 RJ-45;\n" + 
					"1 combo de auriculares/micrófono\n" + 
					"Lector de tarjetas SD multiformato HP\n" + 
					"Sistema operativo Windows 10 Home 64\n" + 
					"Dimensiones (Ancho x Profundidad x Altura)  380 x 253.8 x 23.8 mm\n" + 
					"Peso 1.9 kg \n" + 
					"Color Cubierta y base de color plata natural, marco de teclado de color plata ceniza","https://thumb.pccomponentes.com/w-530-530/articles/15/159076/f1.jpg");
			
			service.save(p1, ep1);
			
			Producto pResult = service.findOne(1L);
			
			EspecificacionDeProducto epResult = service.findOne(p1);
			
			System.out.println(epResult.getDescripcion());
			
		};
	}
}
