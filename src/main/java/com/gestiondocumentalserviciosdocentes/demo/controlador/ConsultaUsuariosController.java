package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaUsuariosService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceConsultaUsuariosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaUsuarios;

@RestController
@RequestMapping(value = "api/v1/consultausuarios")
@CrossOrigin("*")
public class ConsultaUsuariosController {
	
	@GetMapping(value = "/search/{iddep}")
	public ResponseEntity<List<ConsultaUsuarios>> searh(@PathVariable int iddep){
		IConsultaUsuariosService service;
		List<ConsultaUsuarios> response;
		
		service= new InterfaceConsultaUsuariosServiceImpl();
		response= service.getConsultaUsuarios(iddep);
		
		if (response != null) {
			
			return new ResponseEntity<List<ConsultaUsuarios>>(response,HttpStatus.OK);
			
		}
		else {
			return new ResponseEntity<List<ConsultaUsuarios>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
