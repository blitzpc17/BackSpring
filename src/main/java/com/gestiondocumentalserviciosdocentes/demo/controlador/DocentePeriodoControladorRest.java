package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.DocentePeriodoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocentePeriodo;

@RestController
@RequestMapping(value = "/api/v1/docenteperiodo")
@CrossOrigin("*")
public class DocentePeriodoControladorRest extends BaseControllerImpl<DocentePeriodo, DocentePeriodoServiceImpl>{

}
