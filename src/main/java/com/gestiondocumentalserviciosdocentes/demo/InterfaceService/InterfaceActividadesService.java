package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Actividades;

public interface InterfaceActividadesService extends GenericService<Actividades, Integer>{

	List<Actividades> buscarActividadxDep(int id_dep);
}
