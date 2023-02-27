package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.DepartamentoAcademicoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DepartamentoAcademico;

@RestController
@RequestMapping(value = "/api/v1/departamentoacademico")
@CrossOrigin("*")
public class DepartamentoAcademicoControlador extends BaseControllerImpl<DepartamentoAcademico,DepartamentoAcademicoServiceImpl>{

	@GetMapping(value = "/{id_desarrollo_academico}/{id_departamento}")
	public DepartamentoAcademico depacademicos(@PathVariable int id_desarrollo_academico, @PathVariable int id_departamento){
		return service.depacademicos(id_desarrollo_academico, id_departamento);
	}
}
