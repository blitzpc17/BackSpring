package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Convocatorias;

public interface InterfaceConvocatoriasService extends GenericService<Convocatorias,Integer>{

	List<Convocatorias> buscarxdep(int id_dep, int id_usuario);
}
