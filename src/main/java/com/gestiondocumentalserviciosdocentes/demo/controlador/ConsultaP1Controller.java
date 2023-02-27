package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaP1Service;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceConsultaP1Impl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaPeriodo1;

@RestController
@RequestMapping(value = "api/v1/consultap1")
@CrossOrigin("*")
public class ConsultaP1Controller {
	
	@GetMapping(value = "/search")
	public ResponseEntity<List<ConsultaPeriodo1>> search() {
		IConsultaP1Service service;
		List<ConsultaPeriodo1> response;
		
		service = new InterfaceConsultaP1Impl();
		response = service.getConsultaPeriodo1();
		
		if (response != null) {
			
			return new ResponseEntity<List<ConsultaPeriodo1>>(response , HttpStatus.OK);
			
		}
		else {
			
			return new ResponseEntity<List<ConsultaPeriodo1>>(response , HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
		 
		
		
	}
	
}
