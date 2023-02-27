package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IDocSocialServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocSocial;

@RestController
@RequestMapping(value = "/api/v1/docsocial")
@CrossOrigin("*")
public class DocSocialControlador extends BaseControllerImpl<DocSocial,IDocSocialServiceImpl>{

}
