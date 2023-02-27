package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceDocumentosCapacitacionesServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosCapacitaciones;

@RestController
@RequestMapping(value = "/api/v1/documentoscapacitaciones")
@CrossOrigin("*")
public class DocumentosCapacitacionesControlador extends BaseControllerImpl<DocumentosCapacitaciones,InterfaceDocumentosCapacitacionesServiceImpl>{

	@GetMapping(value = "/{id_capacitacion}")
	public List<DocumentosCapacitaciones> documentos(@PathVariable int id_capacitacion){
		return service.documentos(id_capacitacion);
	}
}
