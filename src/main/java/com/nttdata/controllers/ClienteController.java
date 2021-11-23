package com.nttdata.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@RequestMapping("")
	public String clientes() {
		return "estamos en clientes";
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
