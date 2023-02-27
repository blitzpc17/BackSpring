package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.ProDocQService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.ProDocQServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ProDocQ;

@RestController
@RequestMapping(value = "api/v1/prodocq")
@CrossOrigin("*")
public class ProDocQControlador {
	
	@GetMapping(value = "search/{Filtro}/{idPer}")	
	public ResponseEntity<List<ProDocQ>> search(@PathVariable  String Filtro, @PathVariable int idPer){
		
		ProDocQService service;
		List<ProDocQ> response;
		
		service = new ProDocQServiceImpl();
		response = service.getDocenciaQ(Filtro, idPer);
		
		if(response != null) {
			return new ResponseEntity<List<ProDocQ>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<ProDocQ>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
