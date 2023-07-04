package com.eCommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Clase controlador para el acceso de admin
 * @author Miguel
 *
 */
@Controller
@RequestMapping ("/administrador")
public class AdministradorController {
	
	@GetMapping ("")
	public String home () {
		return "administrador/home";
	}
}
