package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaAsesoresService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceConsultaAsesoresServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaAsesores;


@RestController
@RequestMapping(value = "api/v1/consultaasesores")
@CrossOrigin("*")
public class ConsultaAsesoresController  {
	
	@GetMapping(value = "/search/{iddep}/{idper}")
	public ResponseEntity<List<ConsultaAsesores>> search(@PathVariable int iddep, @PathVariable int idper){
		IConsultaAsesoresService service;
		List<ConsultaAsesores> response;
		
		service= new InterfaceConsultaAsesoresServiceImpl();
		response= service.getConsultaAsesores(iddep, idper);
		
if (response != null) {
			
			return new ResponseEntity<List<ConsultaAsesores>>(response,HttpStatus.OK);
			
		} else {
			
			return new ResponseEntity<List<ConsultaAsesores>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}

}
