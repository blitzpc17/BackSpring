package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.TecnologicosUsService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.TecnologicosUsServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.TecnologicosUs;

@RestController
@RequestMapping(value = "api/v1/tecnologicous")
@CrossOrigin("*")
public class TecnologicosUsControlador {
	
	@GetMapping(value = "search/{Filtro}")
	public ResponseEntity<List<TecnologicosUs>> search(@PathVariable  String Filtro){
		
		TecnologicosUsService service;
		List<TecnologicosUs> response;
		
		service = new TecnologicosUsServiceImpl();
		response = service.getTecnologicoQ(Filtro);
		
		if(response!=null) {
			return new ResponseEntity<List<TecnologicosUs>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<TecnologicosUs>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
