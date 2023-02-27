package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.ActividadDocenciaServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ActividadDocencia;

@RestController
@RequestMapping(value = "/api/v1/actdocdocente")
@CrossOrigin("*")
public class ActividadDocenciaControladorRest extends BaseControllerImpl<ActividadDocencia, ActividadDocenciaServiceImpl> {

}
