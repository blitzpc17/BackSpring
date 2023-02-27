package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.GestionLaboratorioImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.GestionLaboratorio;

@RestController
@RequestMapping(value = "/api/v1/gestionlaboratorio")
@CrossOrigin("*")
public class GestionLaboratorioControladorRest extends BaseControllerImpl<GestionLaboratorio, GestionLaboratorioImpl > {

}
