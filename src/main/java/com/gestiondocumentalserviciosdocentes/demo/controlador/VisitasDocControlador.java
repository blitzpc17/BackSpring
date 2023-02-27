package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.VisitasDocServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.VisitasDoc;

@RestController
@RequestMapping(value = "/api/v1/visitasdocumentos")
@CrossOrigin("*")
public class VisitasDocControlador extends BaseControllerImpl<VisitasDoc,VisitasDocServiceImpl>{

}
