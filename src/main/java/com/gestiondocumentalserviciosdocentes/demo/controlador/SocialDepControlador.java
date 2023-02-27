package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.SocialDepService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.SocialDepServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SocialDep;

@RestController
@RequestMapping(value = "api/v1/socialdep")
@CrossOrigin("*")
public class SocialDepControlador {
	
	@GetMapping(value = "search/{Filtro}/{Per}")
	public ResponseEntity<List<SocialDep>> search(@PathVariable String Filtro, @PathVariable String Per){
		
		SocialDepService service;
		List<SocialDep> response;
		
		service = new SocialDepServiceImpl();
		response = service.getSocialQ(Filtro, Per);
		if(response != null) {
			return new ResponseEntity<List<SocialDep>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<SocialDep>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}

}
