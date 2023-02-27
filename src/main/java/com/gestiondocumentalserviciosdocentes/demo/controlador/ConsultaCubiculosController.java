package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaCubiculosService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceConsultaCubiculosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaCubiculos;

@RestController
@RequestMapping(value = "api/v1/consultacubiculos")
@CrossOrigin("*")
public class ConsultaCubiculosController {
	
	@GetMapping(value = "/search/{id_dep}")
	public ResponseEntity<List<ConsultaCubiculos>> search(@PathVariable int id_dep){
		IConsultaCubiculosService service;
		List<ConsultaCubiculos> response;
		
		service=new InterfaceConsultaCubiculosServiceImpl();
		response= service.getConsultaCubiculos(id_dep);
		
		if (response != null) {
			
			return new ResponseEntity<List<ConsultaCubiculos>>(response,HttpStatus.OK);
			
		}
		else {
			
			return new ResponseEntity<List<ConsultaCubiculos>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
