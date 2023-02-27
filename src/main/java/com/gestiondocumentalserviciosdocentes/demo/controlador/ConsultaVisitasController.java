package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaVisitasService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceConsultaVisitasServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaVisitas;

@RestController
@RequestMapping(value = "api/v1/consultavisitas")
@CrossOrigin("*")
public class ConsultaVisitasController {

	@GetMapping(value = "/search/{iddep}/{idper}")
	public ResponseEntity<List<ConsultaVisitas>> search(@PathVariable int iddep, @PathVariable int idper){
		IConsultaVisitasService service;
		List<ConsultaVisitas> response;
		
		service = new InterfaceConsultaVisitasServiceImpl();
		response = service.getConsultaVisitas(iddep, idper);
		
		if ( response != null ) {
			
			return new ResponseEntity<List<ConsultaVisitas>>(response,HttpStatus.OK);
			
		} else {
			
			return new ResponseEntity<List<ConsultaVisitas>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
	}
	
}
