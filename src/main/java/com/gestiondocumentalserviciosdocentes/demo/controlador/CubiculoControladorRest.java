package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.CubiculoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Cubiculo;

@RestController
@RequestMapping(value = "/api/v1/cubiculo")
@CrossOrigin("*")
public class CubiculoControladorRest extends BaseControllerImpl<Cubiculo,CubiculoServiceImpl >{

	@GetMapping(value = "/usuario")
	public Cubiculo buscarCubiculoxUsuario(@RequestParam int id_usuarios){
		return service.buscarCubiculoxUsuario(id_usuarios);
	}
}
