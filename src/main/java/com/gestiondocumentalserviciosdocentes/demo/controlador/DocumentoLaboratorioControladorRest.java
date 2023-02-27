package com.gestiondocumentalserviciosdocentes.demo.controlador;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseControllerImpl;
import com.gestiondocumentalserviciosdocentes.demo.implServicio.DocumentoLaboratorioServiceImpl;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentoLaboratorio;

@RestController
@RequestMapping(value = "/api/v1/documentolaboratorio")
@CrossOrigin("*")
public class DocumentoLaboratorioControladorRest extends BaseControllerImpl<DocumentoLaboratorio, DocumentoLaboratorioServiceImpl> {

}
