package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.SocialProcesosService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.SocialProcesosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SocialProcesos;

@RestController
@RequestMapping(value = "api/v1/socialprocesos")
@CrossOrigin("*")
public class SocialProcesosControlador {
	
	@GetMapping(value = "search/{Filtro}")
	public ResponseEntity<List<SocialProcesos>> search(@PathVariable String Filtro) {
		
		SocialProcesosService service;
		List<SocialProcesos> response;
		
		service = new SocialProcesosServiceImpl();
		response = service.getSocialq(Filtro);
		
		if(response  != null) {
			return new ResponseEntity<List<SocialProcesos>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<SocialProcesos>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
			
	}

}
