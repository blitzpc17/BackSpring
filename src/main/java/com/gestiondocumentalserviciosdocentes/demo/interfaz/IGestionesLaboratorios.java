package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.modelo.GestionesLaboratorios;

public interface IGestionesLaboratorios {

	List<GestionesLaboratorios> getGestionesLaboratorios(int filtro, int filtro2);
}
