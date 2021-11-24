package com.nttdata.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@RequestMapping("")
	public String clientes(Model model,HttpSession session ) {
	
		model.addAttribute("error", "si");
		model.addAttribute("mensaje", "Error en el nombre model");
		session.setAttribute("mensaje", "Error en el nombre session");
		model.addAttribute("nombre", "Israel");
		model.addAttribute("apellido", "Palma");
		return "cliente.jsp";
	}
	
	@RequestMapping("/pagos")
	public String pagos() {
		return "estamos en clientes pagos";
	}
	
	// recibir parametros por url (@PathVariable("variable") tipoDato variable)
	@RequestMapping("/m/{rut}/{dv}")
	public String rutCliente(
			@PathVariable("rut") Integer rut, 
			@PathVariable("dv") String dv ) {
		return " el rut es: "+rut+" , de digito: "+dv;
	}
	

}
