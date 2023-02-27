package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.IConsultaDocCatalogoService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceConsultaDocCatalogoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ConsultaDocCatalogo;

@RestController
@RequestMapping(value = "api/v1/consultadoccatalogo")
@CrossOrigin("*")
public class ConsultaDocCatalogoController {
	
	@GetMapping(value = "/search/{iddep}")
	public ResponseEntity<List<ConsultaDocCatalogo>> search(@PathVariable int iddep){
		IConsultaDocCatalogoService service;
		List<ConsultaDocCatalogo> response;
		
		service=new InterfaceConsultaDocCatalogoServiceImpl();
		response=service.getConsultaDocCatalogos(iddep);
		
	if (response != null) {
			
			return new ResponseEntity<List<ConsultaDocCatalogo>>(response,HttpStatus.OK);
			
		}
		else {
			
			return new ResponseEntity<List<ConsultaDocCatalogo>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
