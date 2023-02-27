package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosLaboratorios;

public interface IDocumentosLaboratoriosService {
	 List<DocumentosLaboratorios> getDocumentosLaboratorios(int filtro,int filtro2);
}
