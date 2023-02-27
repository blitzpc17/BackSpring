package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaDocVisitasService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceConsultaDocVisitasServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDocVisitas;

@RestController
@RequestMapping(value = "api/v1/consultadocvisitas")
@CrossOrigin("*")
public class ConsultaDocVisitasController {

	@GetMapping(value = "/search/{idvis}")
	public ResponseEntity<List<ConsultaDocVisitas>> search(@PathVariable int idvis){
		IConsultaDocVisitasService service;
		List<ConsultaDocVisitas> response;
		
		service= new InterfaceConsultaDocVisitasServiceImpl();
		response= service.getConsultaDocVisitas(idvis);
		
if (response != null) {
			
			return new ResponseEntity<List<ConsultaDocVisitas>>(response,HttpStatus.OK);
			
		} else {
			
			return new ResponseEntity<List<ConsultaDocVisitas>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
}
