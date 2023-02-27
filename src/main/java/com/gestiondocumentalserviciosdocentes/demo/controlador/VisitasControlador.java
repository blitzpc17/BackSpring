package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceVisitasServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Visitas;

@RestController
@RequestMapping(value = "/api/v1/visitas")
@CrossOrigin("*")
public class VisitasControlador extends BaseControllerImpl<Visitas,InterfaceVisitasServiceImpl>{

}
