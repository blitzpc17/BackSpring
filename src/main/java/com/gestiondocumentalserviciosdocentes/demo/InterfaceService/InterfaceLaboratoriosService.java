package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;


import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Laboratorios;

public interface InterfaceLaboratoriosService extends GenericService<Laboratorios, Integer> {
	
	void deletelab(int id);

}
