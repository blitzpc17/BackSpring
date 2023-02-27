package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Periodos;

public interface InterfacePeriodosService extends GenericService<Periodos, Integer>  {
	
	List<Periodos> searchperiodos();
	
	Periodos comprobarperiodos(String mesini, String mesfin, String year);
	
	void updateperiodos();
	
	List<Periodos> periodosdesarrollo( int id_dep);
	 

}
