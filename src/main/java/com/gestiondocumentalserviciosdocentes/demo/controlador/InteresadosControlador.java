package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.InteresadosService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InteresadosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Interesados;

@RestController
@RequestMapping(value = "api/v1/interesados")
@CrossOrigin("*")
public class InteresadosControlador {
	
	@GetMapping(value = "search/{Filtro}")
	public ResponseEntity<List<Interesados>> search(@PathVariable String Filtro){
		
		InteresadosService service;
		List<Interesados> response;
		
		service = new InteresadosServiceImpl();
		response = service.getListaQ(Filtro);
		
		if(response != null) {
			return new ResponseEntity<List<Interesados>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<Interesados>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
