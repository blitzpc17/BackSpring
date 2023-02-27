package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfacePersonaServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Persona;

@RestController
@RequestMapping(value = "/api/v1/persona")
@CrossOrigin("*")
public class PersonaControladorRest extends BaseControllerImpl<Persona, InterfacePersonaServiceImpl> {

	@GetMapping(value = "/search")
	public List<Persona> search(@RequestParam String filtro, @RequestParam String filtro2){
		return service.search(filtro,filtro2);
	}
	
	@GetMapping(value = "/search2")
	public List<Persona> search2(@RequestParam String filtro, @RequestParam String filtro2){
		return service.search2(filtro, filtro2);
	}
}
