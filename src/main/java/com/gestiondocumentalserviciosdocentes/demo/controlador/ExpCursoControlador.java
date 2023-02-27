package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.implServicio.IExpCursoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ExpCurso;

@RestController
@RequestMapping(value = "api/v1/expcurso")
@CrossOrigin("*")
public class ExpCursoControlador {
	
	@GetMapping(value = "search/{Filtro}")
	public ResponseEntity<List<ExpCurso>> search(@PathVariable String Filtro){
		IExpCursoServiceImpl service;
		List<ExpCurso> response;
		
		service = new IExpCursoServiceImpl();
		response = service.getCursoQ(Filtro);
		
		if(response != null) {
			return new ResponseEntity<List<ExpCurso>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<ExpCurso>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}		
	}
}
