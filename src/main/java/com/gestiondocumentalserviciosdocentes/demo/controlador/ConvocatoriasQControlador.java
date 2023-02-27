package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.ConvocatoriasQService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.ConvocatoriasQServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConvocatoriasQ;

@RestController
@RequestMapping(value = "api/v1/convocatoriasq")
@CrossOrigin("*")
public class ConvocatoriasQControlador {

	@GetMapping(value = "search/{Filtro}/{Per}")
	public ResponseEntity<List<ConvocatoriasQ>> search(@PathVariable String Filtro, @PathVariable String Per){
		ConvocatoriasQService service;
		List<ConvocatoriasQ> response;
		
		service = new ConvocatoriasQServiceImpl();
		response = service.getConvocatoriasQ(Filtro, Per);
		
		if(response != null) {
			return new ResponseEntity<List<ConvocatoriasQ>> (response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<ConvocatoriasQ>> (response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
