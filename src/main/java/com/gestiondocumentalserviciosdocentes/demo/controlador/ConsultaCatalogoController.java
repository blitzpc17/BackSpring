package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaCatalogoService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceConsultaCatalogoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaCatalogo;

@RestController
@RequestMapping(value = "api/v1/consultacatalogo")
@CrossOrigin("*")
public class ConsultaCatalogoController {
	
	@GetMapping(value = "/search/{dep}")
	public ResponseEntity<List<ConsultaCatalogo>> search(@PathVariable int dep){
		IConsultaCatalogoService service;
		List<ConsultaCatalogo> response;
		
		service= new InterfaceConsultaCatalogoServiceImpl();
		response= service.getConsultaCatalogos(dep);
		
if (response != null) {
			
			return new ResponseEntity<List<ConsultaCatalogo>>(response,HttpStatus.OK);
			
		} else {
			
			return new ResponseEntity<List<ConsultaCatalogo>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}

}
