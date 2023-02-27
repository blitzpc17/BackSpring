package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Persona;

public interface InterfacePersonaService extends GenericService<Persona, Integer > {

	List<Persona> search(String filtro, String filtro2);
	
	List<Persona> search2(String filtro, String filtro2);
}
