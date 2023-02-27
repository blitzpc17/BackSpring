package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.DesarrolloAcademicoInstServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DesarrolloAcademicoInst;

@RestController
@RequestMapping(value = "/api/v1/desarrolloacademicoinst")
@CrossOrigin("*")
public class DesarrolloAcademicoInstControlador extends BaseControllerImpl<DesarrolloAcademicoInst,DesarrolloAcademicoInstServiceImpl>{

	@GetMapping(value = "/periodo/{id_periodo}")
	public DesarrolloAcademicoInst depxperiodo(@PathVariable int id_periodo){
		return service.depxperiodo(id_periodo);
	}	
}
