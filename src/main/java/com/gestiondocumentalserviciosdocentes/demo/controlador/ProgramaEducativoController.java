package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceProgramaEducativoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ProgramaEducativo;

@RestController
@RequestMapping("api/v1/programaeducativo")
@CrossOrigin("*")
public class ProgramaEducativoController extends BaseControllerImpl<ProgramaEducativo, InterfaceProgramaEducativoServiceImpl> {

}
