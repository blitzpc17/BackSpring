package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.SocialDQService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.SocialDQServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SocialDQ;

@RestController
@RequestMapping(value = "api/v1/socialdq")
@CrossOrigin("*")
public class SocialDQControlador {
	
	@GetMapping(value = "search/{Filtro}")
	public ResponseEntity<List<SocialDQ>> search(@PathVariable String Filtro){
		SocialDQService service;
		List<SocialDQ> response;
		
		service = new SocialDQServiceImpl();
		response = service.getDocumentosQ(Filtro);
		
		if(response != null) {
			return new ResponseEntity<List<SocialDQ>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<SocialDQ>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
