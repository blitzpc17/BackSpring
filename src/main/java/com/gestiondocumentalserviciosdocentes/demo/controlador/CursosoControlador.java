package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceCursosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Cursos;

@RestController
@RequestMapping(value = "/api/v1/cursos")
@CrossOrigin("*")
public class CursosoControlador extends BaseControllerImpl<Cursos,InterfaceCursosServiceImpl>{

}
