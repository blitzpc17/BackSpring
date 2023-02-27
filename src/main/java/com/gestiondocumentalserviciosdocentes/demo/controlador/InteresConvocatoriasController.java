package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IInteresConvocatoriasServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.InteresConvocatorias;

@RestController
@RequestMapping(value = "/api/v1/interesconvocatorias")
@CrossOrigin("*")
public class InteresConvocatoriasController extends BaseControllerImpl<InteresConvocatorias, IInteresConvocatoriasServiceImpl> {

}
