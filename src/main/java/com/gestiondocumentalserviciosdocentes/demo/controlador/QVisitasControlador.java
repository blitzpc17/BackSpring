package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.QVisitasService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.QVisitasServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.QVisitas;

@RestController
@RequestMapping(value = "api/v1/qvisitas")
@CrossOrigin("*")
public class QVisitasControlador {
	
	@GetMapping(value = "search/{Filtro}")
	public ResponseEntity<List<QVisitas>> search(@PathVariable String Filtro) {
		QVisitasService  service;
		List<QVisitas> response;
		
		service = new QVisitasServiceImpl();
		response = service.getVisitasQ(Filtro);
		
		if(response != null) {
			return new ResponseEntity<List<QVisitas>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<QVisitas>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}		
	}

}
