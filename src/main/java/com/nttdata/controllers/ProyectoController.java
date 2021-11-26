package com.nttdata.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nttdata.models.Proyecto;
import com.nttdata.services.ProyectoService;

@Controller
@RequestMapping("/proyecto")
public class ProyectoController {
	
	@Autowired
	ProyectoService proyectoService;

	@RequestMapping("")
	public String index(Model model) {
		model.addAttribute("proyecto", new Proyecto());
		model.addAttribute("listaProyectos", proyectoService.getAll());
		
		return "proyecto/proyecto.jsp";
	}
	
	@RequestMapping("/crear")
	public String crear(@Valid @ModelAttribute("proyecto") Proyecto proyecto)
	{
		proyectoService.save(proyecto);
		return "redirect:/proyecto";
	}

}
