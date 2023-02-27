package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.DateInnService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.DateInnServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DateInn;

@RestController
@RequestMapping(value = "api/v1/dateinn")
@CrossOrigin("*")
public class DateInnControlador {
	
	@GetMapping(value = "search/{year}")
	public ResponseEntity<List<DateInn>> search(@PathVariable String year){
		
		DateInnService service;
		List<DateInn> response;
		
		service = new DateInnServiceImpl();
		response = service.getDateInn(year);
		
		if(response != null) {
			return new ResponseEntity<List<DateInn>> (response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<DateInn>> (response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}

}
