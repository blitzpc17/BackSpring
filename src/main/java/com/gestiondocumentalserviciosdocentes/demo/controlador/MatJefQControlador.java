package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.MatJefQService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.MatJefQServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.MatJefQ;

@RestController
@RequestMapping(value = "api/v1/matjefq")
@CrossOrigin("*")
public class MatJefQControlador {
	
	@GetMapping(value = "search/{Filtro}")
	public ResponseEntity<List<MatJefQ>> search(@PathVariable String Filtro) {
		
		MatJefQService service;
		List<MatJefQ> response;
		
		service = new MatJefQServiceImpl();
		response = service.getMaterialQ(Filtro);
		
		if(response != null) {
			return new ResponseEntity<List<MatJefQ>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<MatJefQ>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
