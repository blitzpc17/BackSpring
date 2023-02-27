package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaAlumnosService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceConsultaAlumnosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaAlumnos;

@RestController
@RequestMapping(value = "api/v1/consultaalumnos")
@CrossOrigin("*")
public class ConsultaAlumnosController {
	
	@GetMapping(value = "/search/{iddep}/{idper}/{idusuario}")
	public ResponseEntity<List<ConsultaAlumnos>> search(@PathVariable int iddep, @PathVariable int idper, @PathVariable int idusuario){
		IConsultaAlumnosService service;
		List<ConsultaAlumnos> response;
		
		service= new InterfaceConsultaAlumnosServiceImpl();
		response= service.getConsultaAlumnos(iddep, idper, idusuario);
		
if (response != null) {
			
			return new ResponseEntity<List<ConsultaAlumnos>>(response,HttpStatus.OK);
			
		} else {
			
			return new ResponseEntity<List<ConsultaAlumnos>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}

}
