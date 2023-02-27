package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceCarrerasServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Carreras;

@RestController
@RequestMapping("api/v1/carreras")
@CrossOrigin("*")
public class CarrerasController extends BaseControllerImpl<Carreras, InterfaceCarrerasServiceImpl> {

	@GetMapping(value = "/searchbydep/{id}")
	public List<Carreras> searchbyDep(@PathVariable String id){
		return service.searchbyDep(id);
	}
	
	@GetMapping(value = "/comprobarcarrera/{id}/{name}")
	public Carreras comprobarcarrera(@PathVariable String id, @PathVariable String name) {
		return service.comprobarcarrera(id, name);
	}
	
}
