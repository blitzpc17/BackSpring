package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Formatos;

public interface IFormatosService extends GenericService<Formatos, Integer> {

	List<Formatos> formatosxdep(int id_dep);
}
