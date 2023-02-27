package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceCubiculosServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Cubiculos;


@RestController
@RequestMapping("api/v1/cubiculos")
@CrossOrigin("*")
public class CubiculosController extends BaseControllerImpl<Cubiculos, InterfaceCubiculosServiceImpl>{

}
