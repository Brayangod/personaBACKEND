package com.brayanproject.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brayanproject.persona.model.Estado;
import com.brayanproject.persona.model.Pais;
import com.brayanproject.persona.service.EstadoService;
import com.brayanproject.persona.service.PaisService;

@RestController
@RequestMapping("/estado/")
public class EstadoREST {

	@Autowired
	private EstadoService estadoService;
	
	@GetMapping("{id}")
	private ResponseEntity<List<Estado>> getAllEstadosByPais(@PathVariable("id")Long idPais){
		return ResponseEntity.ok(estadoService.findAllByCountry(idPais));
	}
}
