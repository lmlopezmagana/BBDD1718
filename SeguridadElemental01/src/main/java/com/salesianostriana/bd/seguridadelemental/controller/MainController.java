package com.salesianostriana.bd.seguridadelemental.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class MainController {
	
	@Autowired
	private HttpSession session;
	
	@GetMapping({"/", "/index"})
	public String welcome(Model model) {
		model.addAttribute("usuario", session.getAttribute("usuarioActual"));
		return "app/index";
	}
	
	

}
