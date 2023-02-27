package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosCapacitaciones;

public interface InterfaceDocumentosCapacitacionesService extends GenericService<DocumentosCapacitaciones,Integer>{

	List<DocumentosCapacitaciones> documentos(int id_capacitacion);
}
