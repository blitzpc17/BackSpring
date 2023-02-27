package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IInfocursoService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IInfocursoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Infocurso;

@RestController
@RequestMapping(value = "api/v1/infocurso")
@CrossOrigin("*")
public class InfocursoControlador {
	
	@GetMapping(value = "search/{Filtro}")
	public ResponseEntity<List<Infocurso>> search(@PathVariable String Filtro) {
		IInfocursoService service;
		List<Infocurso> response;
		
		service = new IInfocursoServiceImpl();
		response = service.getCursoQ(Filtro);
		if(response != null) {
			return new ResponseEntity<List<Infocurso>> (response, HttpStatus.OK);
		}else{
			return new ResponseEntity<List<Infocurso>> (response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
