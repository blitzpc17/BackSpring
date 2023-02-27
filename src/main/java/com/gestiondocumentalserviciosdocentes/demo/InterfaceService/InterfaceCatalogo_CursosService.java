package com.gestiondocumentalserviciosdocentes.demo.InterfaceService;

import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.genericos.GenericService;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Catalogo_Cursos;

public interface InterfaceCatalogo_CursosService extends GenericService<Catalogo_Cursos, Integer>{

	List<Catalogo_Cursos> catalogocursos(int id_dep);
}
