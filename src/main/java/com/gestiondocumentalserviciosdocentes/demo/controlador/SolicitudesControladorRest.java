package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.SolicitudesServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Solicitudes;

@RestController
@RequestMapping(value = "/api/v1/solicitudes")
@CrossOrigin("*")
public class SolicitudesControladorRest extends BaseControllerImpl<Solicitudes, SolicitudesServiceImpl>{

}
