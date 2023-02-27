package com.gestiondocumentalserviciosdocentes.demo.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IProductos_Des_TecServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Productos_Des_Tecnologico;

@RestController
@RequestMapping("api/v1/productosdestec")
@CrossOrigin("*")
public class Productos_Des_TecControlador extends BaseControllerImpl<Productos_Des_Tecnologico, IProductos_Des_TecServiceImpl>{

	@GetMapping(value = "/{id_docper}/{id_usuario}")
	public List<Productos_Des_Tecnologico> iniciarSesion(@PathVariable int id_docper, @PathVariable int id_usuario){
		return service.buscarProductos_Des_Tec(id_docper, id_usuario); 
	}
}
