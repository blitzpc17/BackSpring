package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.DatosCursoService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.DatosCursoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DatosCurso;

@RestController
@RequestMapping(value = "api/v1/datoscurso")
@CrossOrigin("*")
public class DatosCursoControlador {
	
	@GetMapping(value = "search/{Filtro}")
	public ResponseEntity<List<DatosCurso>> search(@PathVariable  String Filtro){
		DatosCursoService  service;
		List<DatosCurso> response;
		
		service = new DatosCursoServiceImpl();
		response = service.getCursoQ(Filtro);
		
		if(response != null) {
			return new ResponseEntity<List<DatosCurso>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<DatosCurso>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
