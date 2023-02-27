package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.SeguimientoAulaImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SeguimientoAula;

@RestController
@RequestMapping(value = "/api/v1/seguimientoaula")
@CrossOrigin("*")
public class SeguimientoAulaControladorRest extends BaseControllerImpl<SeguimientoAula, SeguimientoAulaImpl>{

}
