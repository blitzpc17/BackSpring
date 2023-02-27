package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaPeriodosDocService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceConsultaPeriodosDocServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaPeriodosDoc;

@RestController
@RequestMapping(value = "api/v1/consultaperiodosdoc")
@CrossOrigin("*")
public class ConsultaPeriodosDocController {
	
	@GetMapping(value = "/search/{idlab}")
	public ResponseEntity<List<ConsultaPeriodosDoc>> search(@PathVariable int idlab){
		IConsultaPeriodosDocService service;
		List<ConsultaPeriodosDoc> response;
		
		service=new InterfaceConsultaPeriodosDocServiceImpl();
		response=service.getConsultaPeriodosDoc(idlab);
		
		if (response != null) {
			return new ResponseEntity<List<ConsultaPeriodosDoc>>(response,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<List<ConsultaPeriodosDoc>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
