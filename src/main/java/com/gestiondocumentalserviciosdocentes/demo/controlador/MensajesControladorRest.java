package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceMensajesServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Mensajes;


@RestController
@RequestMapping(value = "/api/v1/mensajes")
@CrossOrigin("*")
public class MensajesControladorRest extends BaseControllerImpl<Mensajes,InterfaceMensajesServiceImpl>{

}
