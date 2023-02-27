package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaDepartamentService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceConsultaDepartamentoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDepartamento;

@RestController
@RequestMapping(value = "api/v1/consultadepartamento")
@CrossOrigin("*")
public class ConsultaDepartamentoController {
	
	@GetMapping(value = "/search")
	public ResponseEntity<List<ConsultaDepartamento>> search(){
		IConsultaDepartamentService service;
		List<ConsultaDepartamento> response;
		
		service = new InterfaceConsultaDepartamentoServiceImpl();
		response = service.getConsultaDepartamento();
		
		if (response != null) {
			
			return new ResponseEntity<List<ConsultaDepartamento>>(response,HttpStatus.OK);
			
		} else {
			
			return new ResponseEntity<List<ConsultaDepartamento>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}

}
