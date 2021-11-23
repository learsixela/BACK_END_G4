package com.nttdata.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	//http://localhost:8080/
	// metodo inicial
	public String index() {
		return "Hola Clase";
	}
	
	@RequestMapping("/index")
	public String index2() {
		return "Hola Clase 2";
	}
	
	@RequestMapping("/everis")
	public String everis() {
		return "Ahora somos NttData";
	}

}
