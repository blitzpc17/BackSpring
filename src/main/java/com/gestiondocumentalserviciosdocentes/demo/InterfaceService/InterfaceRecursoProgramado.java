package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.RecursoProgramado;

public interface InterfaceRecursoProgramado  extends GenericService<RecursoProgramado, Integer>{
	RecursoProgramado ObtenerRecursoProgramadoDeptoPeriodo(int depto, int periodo);
}
