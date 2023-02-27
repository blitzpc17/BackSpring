package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceMatJefaturaServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.MatJefatura;

@RestController
@RequestMapping(value = "/api/v1/matjefatura")
@CrossOrigin("*")
public class MatJefaturaControlador extends BaseControllerImpl<MatJefatura,InterfaceMatJefaturaServiceImpl>{
	
	

}
