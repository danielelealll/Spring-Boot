package com.mentalidadesehabilidades.persistencia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persistencia")
public class PersistenciaController {
	
	@GetMapping
	public String persistencia() {
		return "A mentalidade e habilidade escolhida foi persistência";
		
	}

}
