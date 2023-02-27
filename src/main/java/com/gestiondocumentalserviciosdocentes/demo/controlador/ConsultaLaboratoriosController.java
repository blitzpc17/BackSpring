package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaLaboratoriosService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceConsultaLaboratoriosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaLaboratorios;

@RestController
@RequestMapping(value = "api/v1/consultalaboratorios")
@CrossOrigin("*")
public class ConsultaLaboratoriosController {
	
	@GetMapping(value = "/search/{id}")
	public ResponseEntity<List<ConsultaLaboratorios>> search(@PathVariable int id){
		IConsultaLaboratoriosService service;
		List<ConsultaLaboratorios> response;
		
		service= new InterfaceConsultaLaboratoriosServiceImpl();
		response= service.getConsultaLaboratorios(id);
		
		if (response != null) {
			
			return new ResponseEntity<List<ConsultaLaboratorios>>(response,HttpStatus.OK);
			
		} else {
			
			return new ResponseEntity<List<ConsultaLaboratorios>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}

}
