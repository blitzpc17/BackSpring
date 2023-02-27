package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.TecnologicoQService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.TecnologicoQServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.TecnologicoQ;

@RestController
@RequestMapping(value = "api/v1/tecnologicoq")
@CrossOrigin("*")
public class TecnologicoQControlador {

	@GetMapping(value = "search/{Filtro}/{idPer}")
	public ResponseEntity<List<TecnologicoQ>> search(@PathVariable String Filtro, @PathVariable int idPer){
		
		TecnologicoQService service;
		List<TecnologicoQ> response;
		
		service = new TecnologicoQServiceImpl();
		response = service.getTecnologicoQ(Filtro, idPer);
		
		if(response!=null) {
			return new ResponseEntity<List<TecnologicoQ>> (response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<TecnologicoQ>> (response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
