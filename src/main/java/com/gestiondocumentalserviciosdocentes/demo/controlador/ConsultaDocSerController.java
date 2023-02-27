package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaDocSerService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceConsultaDocSerServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDocSer;

@RestController
@RequestMapping(value = "api/v1/consultadocservicio")
@CrossOrigin("*")
public class ConsultaDocSerController {
	
	@GetMapping(value = "/search/{idser}")
	public ResponseEntity<List<ConsultaDocSer>> search(@PathVariable int idser){
		IConsultaDocSerService service;
		List<ConsultaDocSer> response;
		
		service= new InterfaceConsultaDocSerServiceImpl();
		response= service.getConsultaDocSers(idser);
		
if (response != null) {
			
			return new ResponseEntity<List<ConsultaDocSer>>(response,HttpStatus.OK);
			
		} else {
			
			return new ResponseEntity<List<ConsultaDocSer>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}

}
