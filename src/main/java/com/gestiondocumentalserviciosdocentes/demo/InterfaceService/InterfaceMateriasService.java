package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;


import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Materias;

public interface InterfaceMateriasService extends GenericService<Materias, Integer>{

	List<Materias> searchbyDep(String id);
	
	Materias comprobarmaterias(String id,String clave);
	
}
