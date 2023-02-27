package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.GestionesLaboratorios;

public interface IGestionesLaboratoriosService {

	List<GestionesLaboratorios> getGestionesLaboratorios(int filtro, int filtro2);
}
