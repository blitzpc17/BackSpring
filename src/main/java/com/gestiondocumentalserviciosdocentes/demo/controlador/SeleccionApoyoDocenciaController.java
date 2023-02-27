package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.ISeleccionApoyoDocenciaServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SeleccionApoyoDocencia;

@RestController
@RequestMapping("api/v1/seleccionapoyo")
@CrossOrigin("*")
public class SeleccionApoyoDocenciaController extends BaseControllerImpl<SeleccionApoyoDocencia, ISeleccionApoyoDocenciaServiceImpl>{

	@GetMapping(value = "/busca/{id_docper}/{id_act}")
	public SeleccionApoyoDocencia usuariosxdep(@PathVariable int id_docper, @PathVariable int id_act){
		return service.buscaxdepactividad(id_docper, id_act);
	}
}
