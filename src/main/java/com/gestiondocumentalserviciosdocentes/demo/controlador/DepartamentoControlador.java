package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceDepartamentoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Departamento;

@RestController
@RequestMapping(value = "/api/v1/departamento")
@CrossOrigin("*")
public class DepartamentoControlador extends BaseControllerImpl<Departamento,InterfaceDepartamentoServiceImpl>{

	@GetMapping(value = "/academicos/{id_depaca}")
	public List<Departamento> depacademicos(@PathVariable int id_depaca){
		return service.depacademicos(id_depaca);
	}
	
	@GetMapping(value = "/vinculacion")
	public Departamento traevinculacion(){
		return service.traevinculacion();
	}
	
	@GetMapping(value = "/academicos")
	public List<Departamento> traedepsac(){
		return service.traeDepAcademicos();
	}
}
