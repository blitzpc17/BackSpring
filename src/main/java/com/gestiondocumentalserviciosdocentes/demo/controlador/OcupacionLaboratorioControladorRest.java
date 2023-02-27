package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.OcupacionLaboratorioServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.OcupacionLaboratorio;

@RestController
@RequestMapping(value = "/api/v1/ocupacionlaboratorio")
@CrossOrigin("*")
public class OcupacionLaboratorioControladorRest extends BaseControllerImpl<OcupacionLaboratorio, OcupacionLaboratorioServiceImpl>{

}
