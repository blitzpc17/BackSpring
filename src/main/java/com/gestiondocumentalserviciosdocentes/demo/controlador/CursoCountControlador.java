package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.CursoCountService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.CursoCountServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.CursoCount;

@RestController
@RequestMapping(value = "api/v1/cursocount")
@CrossOrigin("*")
public class CursoCountControlador {
	
	@GetMapping(value = "search/{Filtro}")
	public ResponseEntity<List<CursoCount>> search(@PathVariable String Filtro){
		CursoCountService service;
		List<CursoCount> response;
		
		service = new CursoCountServiceImpl();
		response = service.getCursoQ(Filtro);
		if(response != null) {
			return new ResponseEntity<List<CursoCount>> (response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<CursoCount>> (response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
