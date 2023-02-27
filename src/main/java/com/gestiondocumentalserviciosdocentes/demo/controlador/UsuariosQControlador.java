package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.UsuariosQService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.UsuariosQServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.UsuariosQ;

@RestController
@RequestMapping(value = "api/v1/usuariosq")
@CrossOrigin("*")
public class UsuariosQControlador {
	
	@GetMapping(value = "search/{Filtro}")
	public ResponseEntity<List<UsuariosQ>> search(@PathVariable String Filtro){
		UsuariosQService service;
		List<UsuariosQ> response;
		
		service = new UsuariosQServiceImpl();
		response = service.getUsuarios(Filtro);
		
		if(response != null) {
			return new ResponseEntity<List<UsuariosQ>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<UsuariosQ>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
