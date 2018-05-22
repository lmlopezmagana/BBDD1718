package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador de entrada. Nos redirige directamente al listado de todas las entidades
 *  
 * @author luismi
 *
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String welcome() {
    	return "redirect:/entidad/list";
    }

}
