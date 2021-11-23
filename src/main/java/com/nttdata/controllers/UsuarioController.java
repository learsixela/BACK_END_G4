package com.nttdata.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nttdata.models.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	//desplegar inicialmente el jsp
	@RequestMapping("")
	public String usuario(@ModelAttribute("usuario") Usuario usuario,
			Model model) {
		//model.addAttribute("usuario", new Usuario());
		return "usuario/usuario.jsp";
	}
	
	//capturar la informacion del formulario
	@RequestMapping("/login")
	/*public String login(@RequestParam("nombre") String nombre,
			@RequestParam("apellido") String apellido,
			@RequestParam("limite") String limite,
			@RequestParam("cp") String codigoPostal
			) */
	public String login(@Valid @ModelAttribute("usuario") Usuario usuario)
	{
		System.out.println(usuario.getNombre()+" "+usuario.getApellido()+" "+usuario.getLimite()+" "+usuario.getCodigoPostal());
		//System.out.println(nombre+" "+apellido+" "+limite+" "+codigoPostal);
		return "redirect:/usuario";
	}
	
}
