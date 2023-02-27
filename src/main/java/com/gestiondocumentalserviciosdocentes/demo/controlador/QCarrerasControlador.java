package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.QCarrerasService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.QCarrerasServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.QCarreras;

@RestController
@RequestMapping(value = "api/v1/qcarreras")
@CrossOrigin("*")
public class QCarrerasControlador {
	
	@GetMapping(value = "search/{Filtro}")
	public ResponseEntity<List<QCarreras>> search(@PathVariable String Filtro) {
		QCarrerasService service;
		List<QCarreras> response;
		
		service = new QCarrerasServiceImpl();
		response = service.getCarrerasQ(Filtro);
		
		if(response != null) {
			return new ResponseEntity<List<QCarreras>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<QCarreras>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
