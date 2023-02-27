package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IMaterialJefaturaServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.MaterialJefatura;

@RestController
@RequestMapping("api/v1/materialjefatura")
@CrossOrigin("*")
public class MaterialJefaturaController extends BaseControllerImpl<MaterialJefatura, IMaterialJefaturaServiceImpl> {

	@GetMapping(value = "/{id_dep}")
	public List<MaterialJefatura> materialxdep(@PathVariable int id_dep){
		return service.materialxdep(id_dep);
	}
}
