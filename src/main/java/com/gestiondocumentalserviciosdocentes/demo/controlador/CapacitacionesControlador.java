package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.CapacitacionesServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Capacitaciones;


@RestController
@RequestMapping(value = "/api/v1/capacitaciones")
@CrossOrigin("*")
public class CapacitacionesControlador extends BaseControllerImpl<Capacitaciones,CapacitacionesServiceImpl>{

	@GetMapping(value = "/{id_Periodo}/{id_usuario}")
	public List<Capacitaciones> usuariosxdep(@PathVariable int id_Periodo, @PathVariable int id_usuario){
		return service.buscarxusuariodep(id_Periodo, id_usuario);
	}
	
	@GetMapping(value = "/depdesa/{id_depdesa}")
	public List<Capacitaciones> buscardepdesa(@PathVariable int id_depdesa){
		return service.buscardepdesa(id_depdesa);
	}
}
