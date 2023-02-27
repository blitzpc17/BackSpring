package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceMateriasServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Materias;

@RestController
@RequestMapping("api/v1/materias")
@CrossOrigin("*")
public class MateriasController extends BaseControllerImpl<Materias, InterfaceMateriasServiceImpl>{

	@GetMapping(value = "/searchbydep/{id}")
	public List<Materias> searchbyDep(@PathVariable String id){
		return service.searchbyDep(id);
	}
	
	@GetMapping(value = "/comprobarmateria/{id}/{clave}")
	public Materias comprobarmaterias(@PathVariable String id,@PathVariable String clave) {
		return service.comprobarmaterias(id,clave);
	}
	
}
