package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.IDocumentosGruposServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosGrupos;

@RestController
@RequestMapping("api/v1/documentosgrupos")
@CrossOrigin("*")
public class DocumentosGruposController extends BaseControllerImpl<DocumentosGrupos, IDocumentosGruposServiceImpl> {

}
