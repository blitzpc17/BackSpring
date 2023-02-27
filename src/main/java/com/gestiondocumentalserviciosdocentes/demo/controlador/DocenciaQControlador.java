package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.DocenciaQService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.DocenciaQServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocenciaQ;

@RestController
@RequestMapping(value = "api/v1/docenciaq")
@CrossOrigin("*")
public class DocenciaQControlador {
	
	@GetMapping(value = "search/{Filtro}")
	public ResponseEntity<List<DocenciaQ>> search(@PathVariable  String Filtro){
		DocenciaQService service;
		List<DocenciaQ> response;
		
		service = new DocenciaQServiceImpl();
		response = service.getDocenciaQ(Filtro);
		
		if(response != null) {
			return new ResponseEntity<List<DocenciaQ>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<DocenciaQ>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
