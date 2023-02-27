package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IFormatosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Formatos;

@RestController
@RequestMapping(value = "/api/v1/formatos")
@CrossOrigin("*")
public class FormatosController extends BaseControllerImpl<Formatos, IFormatosServiceImpl> {

	@GetMapping(value = "/{id_dep}")
	public List<Formatos> usuariosxdep(@PathVariable int id_dep){
		return service.formatosxdep(id_dep);
	}
}
