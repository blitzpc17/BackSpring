package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceLaboratoriosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Laboratorios;


@RestController
@RequestMapping("api/v1/laboratorios")
@CrossOrigin("*")
public class LaboratoriosController extends BaseControllerImpl<Laboratorios,InterfaceLaboratoriosServiceImpl>{

	@GetMapping(value = "/deletelab/{id}")
	public void deletelab(@PathVariable int id) { 
		service.deletelab(id);
	}
	
}
