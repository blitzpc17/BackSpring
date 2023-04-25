package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RecursoEjercido;

public interface InterfaceRecursoEjercido extends GenericService<RecursoEjercido, Integer>{
	
	RecursoEjercido ObtenerRecursoEjercidoDeptoPeriodo(int depto, int periodo);

}
