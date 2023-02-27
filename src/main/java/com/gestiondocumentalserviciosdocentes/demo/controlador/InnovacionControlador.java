package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceInnovacionServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Innovacion;

@RestController
@RequestMapping(value = "/api/v1/innovacion")
@CrossOrigin("*")
public class InnovacionControlador extends BaseControllerImpl<Innovacion,InterfaceInnovacionServiceImpl>{

}
