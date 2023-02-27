package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.InterfaceSocialServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Social;

@RestController
@RequestMapping(value="api/v1/social")
@CrossOrigin("*")
public class SocialControlador extends BaseControllerImpl<Social,InterfaceSocialServiceImpl>{

}
