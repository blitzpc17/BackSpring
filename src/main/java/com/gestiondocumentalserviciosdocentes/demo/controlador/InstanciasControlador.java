package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceInstanciaServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Instancias;

@RestController
@RequestMapping(value = "/api/v1/instancias")
@CrossOrigin("*")
public class InstanciasControlador extends BaseControllerImpl<Instancias,InterfaceInstanciaServiceImpl>{
	
}
