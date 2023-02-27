package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaVisitasDocenteService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceConsultaVisitasDocenteServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaVisitasDocente;

@RestController
@RequestMapping(value = "api/v1/consultavisitasdocente")
@CrossOrigin("*")
public class ConsultaVisitasDocenteController {
	
	@GetMapping(value = "/search/{iddep}/{idper}/{iduser}")
	public ResponseEntity<List<ConsultaVisitasDocente>> search(@PathVariable int iddep,@PathVariable int idper,@PathVariable int iduser){
		IConsultaVisitasDocenteService service;
		List<ConsultaVisitasDocente> response;
		
		service= new InterfaceConsultaVisitasDocenteServiceImpl();
		response= service.getConsultaVisitasDocentes(iddep, idper, iduser);
		
if (response != null) {
			
			return new ResponseEntity<List<ConsultaVisitasDocente>>(response,HttpStatus.OK);
			
		} else {
			
			return new ResponseEntity<List<ConsultaVisitasDocente>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}

}
