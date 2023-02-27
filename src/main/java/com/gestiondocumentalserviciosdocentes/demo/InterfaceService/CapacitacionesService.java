package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Capacitaciones;

public interface CapacitacionesService extends GenericService<Capacitaciones,Integer>{

	List<Capacitaciones> buscarxusuariodep(int id_Periodo, int id_usuario);
	
	List<Capacitaciones> buscardepdesa( int id_depdesa);
}
