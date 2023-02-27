package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.DocumentoGrupoServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocentePeriodo;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentoGrupo;

@RestController
@RequestMapping(value = "/api/v1/docentedocumento")
@CrossOrigin("*")
public class DocumentoGrupoControladorRest extends BaseControllerImpl<DocumentoGrupo, DocumentoGrupoServiceImpl>{

}
