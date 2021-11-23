package com.nttdata.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	//desplegar inicialmente el jsp
	@RequestMapping("")
	public String usuario() {
		return "usuario.jsp";
	}
	
	//capturar la informacion del formulario
	@RequestMapping("/login")
	public String login(@RequestParam("nombre") String nombre,
			@RequestParam("apellido") String apellido,
			@RequestParam("limite") String limite,
			@RequestParam("cp") String codigoPostal
			) {
		System.out.println(nombre+" "+apellido+" "+limite+" "+codigoPostal);
		return "redirect:/usuario";
	}
	
}
