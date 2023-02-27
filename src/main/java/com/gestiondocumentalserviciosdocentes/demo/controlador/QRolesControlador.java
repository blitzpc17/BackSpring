package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.InterfaceService.QRolesService;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.QRolesServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.QRoles;

@RestController
@RequestMapping(value = "api/v1/qroles")
@CrossOrigin("*")
public class QRolesControlador {
	
	@GetMapping(value = "search")
	public ResponseEntity<List<QRoles>> search(){
		
		QRolesService service;
		List<QRoles> response;
		
		service = new QRolesServiceImpl();
		response = service.getRolesQ();
		
		if(response != null) {
			return new ResponseEntity<List<QRoles>>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<QRoles>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
