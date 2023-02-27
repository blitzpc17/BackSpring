package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.CountVisitasService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.CountVisitasServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.CountVisitas;

@RestController
@RequestMapping(value = "api/v1/countvisitas")
@CrossOrigin("*")
public class CountVisitasControlador {
	
	@GetMapping(value = "search/{Filtro}/{Per}")
	public ResponseEntity<List<CountVisitas>> search(@PathVariable String Filtro,@PathVariable String Per) {
		
		CountVisitasService service;
		List<CountVisitas> response;
		
		service = new CountVisitasServiceImpl();
		response = service.getVisitasQ(Filtro, Per);
		
		if(response != null) {
			return new ResponseEntity<List<CountVisitas>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<CountVisitas>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
