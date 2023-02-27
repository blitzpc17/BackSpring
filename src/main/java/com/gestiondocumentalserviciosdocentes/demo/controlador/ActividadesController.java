package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceActividadesServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Actividades;

@RestController
@RequestMapping("api/v1/actividades")
@CrossOrigin("*")
public class ActividadesController extends BaseControllerImpl<Actividades, InterfaceActividadesServiceImpl>{

	@GetMapping(value = "/{id_dep}")
	public List<Actividades> buscarCubiculoxUsuario(@PathVariable int id_dep){
		return service.buscarActividadxDep(id_dep);
	}
}
