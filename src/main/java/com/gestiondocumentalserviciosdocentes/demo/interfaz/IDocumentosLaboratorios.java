package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosLaboratorios;

public interface IDocumentosLaboratorios {
 List<DocumentosLaboratorios> getDocumentosLaboratorios(int filtro, int filtro2);
}
