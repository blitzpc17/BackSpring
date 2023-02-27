package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.ICmensajeService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.ICmensajeServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Cmensajes;

@RestController
@RequestMapping(value = "api/v1/cmensajes")
@CrossOrigin("*")
public class CmensajesControlador {
	
	@GetMapping(value = "search/{filtro}")
	public ResponseEntity<List<Cmensajes>> search(@PathVariable String filtro){
		ICmensajeService service;
		List<Cmensajes> response;
		
		service = new ICmensajeServiceImpl();
		response = service.getMensajesDep(filtro);
		
		if(response != null) {
			return new ResponseEntity<List<Cmensajes>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<Cmensajes>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}	
		
	}
}
