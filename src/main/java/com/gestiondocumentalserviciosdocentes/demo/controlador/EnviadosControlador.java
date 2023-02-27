package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IEnviadosService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IEnviadosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Enviados;

@RestController
@RequestMapping(value = "api/v1/enviados")
@CrossOrigin("*")
public class EnviadosControlador {
	@GetMapping(value = "search/{rem}/{dest}")
	public ResponseEntity<List<Enviados>> search(@PathVariable String rem, @PathVariable String dest){
		IEnviadosService service;
		List<Enviados> response;
		
		service = new IEnviadosServiceImpl();
		response = service.getEnviadosQ(rem, dest);
		if(response != null) {
			return new ResponseEntity<List<Enviados>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<Enviados>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
}
