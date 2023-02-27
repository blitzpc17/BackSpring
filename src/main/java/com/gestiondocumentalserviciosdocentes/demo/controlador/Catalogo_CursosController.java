package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceCatalogo_CursosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Catalogo_Cursos;


@RestController
@RequestMapping("api/v1/catalogo_cursos")
@CrossOrigin("*")
public class Catalogo_CursosController extends BaseControllerImpl<Catalogo_Cursos, InterfaceCatalogo_CursosServiceImpl>{

	@GetMapping(value = "/mostrar/{id_dep}")
	public List<Catalogo_Cursos> catalogocursos(@PathVariable int id_dep){
		return service.catalogocursos(id_dep);
	}
}
