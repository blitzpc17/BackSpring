package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IUcursosService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IUcursosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Ucursos;

@RestController
@RequestMapping(value = "api/v1/ucursos")
@CrossOrigin("*")
public class UcursosControlador {
	
	@GetMapping(value = "search/{filtro}")
	public ResponseEntity<List<Ucursos>> search(@PathVariable String filtro){
		IUcursosService service;
		List<Ucursos> response;
		
		service = new IUcursosServiceImpl();
		response = service.getCursosUsuario(filtro);
		
		if(response != null) {
			return new ResponseEntity<List<Ucursos>> (response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<Ucursos>> (response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
