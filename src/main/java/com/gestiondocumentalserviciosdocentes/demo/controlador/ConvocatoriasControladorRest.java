package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceConvocatoriasServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Convocatorias;

@RestController
@RequestMapping(value = "/api/v1/convocatorias")
@CrossOrigin("*")
public class ConvocatoriasControladorRest extends BaseControllerImpl<Convocatorias,InterfaceConvocatoriasServiceImpl>{

	@GetMapping(value = "/{id_dep}/{id_usuario}")
	public List<Convocatorias> usuariosxdep(@PathVariable int id_dep, @PathVariable int id_usuario){
		return service.buscarxdep(id_dep, id_usuario);
	}
}
