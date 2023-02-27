package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaDocLabService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceConsultaDocLabServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDocLab;

@RestController
@RequestMapping(value = "api/v1/consultadoclab")
@CrossOrigin("*")
public class ConsultaDocLabController {
	
	@GetMapping(value = "/search/{idgestion}/{iddep}")
	public ResponseEntity<List<ConsultaDocLab>> search(@PathVariable int idgestion, @PathVariable int iddep){
		IConsultaDocLabService service;
		List<ConsultaDocLab> response;
		
		service=new InterfaceConsultaDocLabServiceImpl();
		response=service.getConsultaDocLab(idgestion, iddep);
		
		if (response != null) {
			
			return new ResponseEntity<List<ConsultaDocLab>>(response,HttpStatus.OK);
			
		}
		else {
			
			return new ResponseEntity<List<ConsultaDocLab>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
