package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IProductos_DocenciaServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Productos_Docencia;

@RestController
@RequestMapping("api/v1/productosdocencia")
@CrossOrigin("*")
public class Productos_DocenciaControlador extends BaseControllerImpl<Productos_Docencia, IProductos_DocenciaServiceImpl>{

	@GetMapping(value = "/{id_docper}/{id_usuario}")
	public List<Productos_Docencia> iniciarSesion(@PathVariable int id_docper, @PathVariable int id_usuario){
		return service.buscarProductos_Docencia(id_docper, id_usuario);
	}
}
