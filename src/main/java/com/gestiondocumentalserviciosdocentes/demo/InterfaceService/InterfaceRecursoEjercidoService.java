package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RecursoEjercido;

public interface InterfaceRecursoEjercidoService extends GenericService<RecursoEjercido, Integer>{
	
	RecursoEjercido ObtenerRecursoEjercidoPeriodo(int depto, int periodo);

}
