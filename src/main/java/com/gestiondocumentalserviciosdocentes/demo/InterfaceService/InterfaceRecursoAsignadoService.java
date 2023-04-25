package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RecursoAsignado;

public interface InterfaceRecursoAsignadoService extends GenericService<RecursoAsignado, Integer>{
	
	RecursoAsignado ObtenerRecursoAsignadoDeptoPeriodo(int depto, int periodo);
	
	

}
