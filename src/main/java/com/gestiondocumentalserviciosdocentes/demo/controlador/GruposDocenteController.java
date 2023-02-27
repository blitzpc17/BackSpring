package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IGruposDocenteServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.GruposDocente;

@RestController
@RequestMapping("api/v1/grupos")
@CrossOrigin("*")
public class GruposDocenteController extends BaseControllerImpl<GruposDocente, IGruposDocenteServiceImpl>{

	@GetMapping(value = "/comprobargrupo/{id_mat}/{grupo}/{iddocper}")
	public GruposDocente comprobarGrupos(@PathVariable int id_mat,@PathVariable String grupo, @PathVariable int iddocper) {
		return service.comprobarGrupos(id_mat, grupo, iddocper);
	}
}
