package hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import hello.formbean.UploadFormBean;
import hello.model.EntidadConFichero;
import hello.service.UploadService;

/**
 * 
 * Controlador "nuclear" del ejemplo
 * 
 * @author luismi
 *
 */
@Controller
@RequestMapping("/entidad")
public class EntidadConFicheroController {
	
	
	@Autowired
	UploadService uploadService;
	
	/**
	 * Método que sirve para mostrar el formulario que incluye la subida de un fichero
	 * 
	 * @param model Modelo que servirá para cargar el objeto que hace las veces de form bean
	 * @return String Plantilla a visualizar
	 */
	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("uploadBean", new UploadFormBean());
		return "form";
	}
	
	/**
	 * Método que procesa el formulario con los datos y ficheros que ha introducido el usuario
	 * 
	 * @param uploadBean Objeto que nos trae la información registrada por el usuario en el formulario 
	 * @param file Objeto que nos devuelve el fichero que el usuario ha subido
	 * @param model Modelo para cargar los datos a visualizar (a usar en caso de error)
	 * @return
	 */
	@PostMapping("/submit") 
	public String submit(@ModelAttribute("uploadBean") UploadFormBean uploadBean,  
			@RequestParam("file") MultipartFile file, Model model){
		
		// Transformamos el form bean en una instancia de una entidad de nuestro modelo
		EntidadConFichero p = new EntidadConFichero();
		p.setPropiedadCualquiera(uploadBean.getPropiedadCualquiera());
		// A través del servicio de subida, almacenamos la entidad y el fichero
		if (uploadService.saveAndUpload(p, file)) {
			// Éxito en la subida
			return "redirect:/entidad/list";
		} else {
			// Error en la subida
			model.addAttribute("uploadBean", uploadBean);
			model.addAttribute("uploadError", "Error en la subida de fichero");
			return "form";
		}
		
		
	}
	
	/**
	 * Método que lista todos los objetos del tipo entidad que estamos trabajando
	 * @param model
	 * @return
	 */
	@GetMapping("/list")
	public String list(Model model) {
		
		model.addAttribute("lista", uploadService.list());
		
		return "list";
	}
	
	/**
	 * Método que sirve para visualizar todos los datos de un objeto concreto
	 * @param id Identificador del objeto a visualizar
	 * @param model
	 * @return
	 */
	@GetMapping("/view/{id}")
	public String viewById(@PathVariable("id") String id, Model model) {
		//TODO por hacer
		return "view";
	}
	
	

}
