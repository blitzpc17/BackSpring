package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Carreras;

public interface ICarrerasService extends GenericService<Carreras, Integer>{

	List<Carreras> searchbyDep(String id);
	
	Carreras comprobarcarrera(String id, String name);
	
}
