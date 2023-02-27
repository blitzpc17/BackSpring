package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.VisitaUsService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.VisitasUsServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.VisitasUs;

@RestController
@RequestMapping(value = "api/v1/visitasus")
@CrossOrigin("*")
public class VisitasUsControlador {
	
	@GetMapping(value = "search/{Filtro}")
	public ResponseEntity<List<VisitasUs>> search(@PathVariable String Filtro){
		
		VisitaUsService service;
		List<VisitasUs> response;
		
		service = new VisitasUsServiceImpl();
		response = service.getVisitasQ(Filtro);
		
		if(response != null) {
			return new ResponseEntity<List<VisitasUs>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<VisitasUs>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}		
		
	}

}
